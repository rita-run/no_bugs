package complex_tasks.task4;

import java.util.*;
import java.util.stream.Collectors;

public class MovieService<T extends Number> {
    /*
    MovieService:
    fields:
    - Map<Movie, List<Rating>>

    methods:
    - addRating (thread-safe, validate the rating (1-10)) to a movie
    - calculateMeanRating for each movie
    - sortMoviesByPopularity

    Movie:
    fields:
    - name
    - list of ratings?

    Relations:
    - MovieService knows about all the movies
    - MovieService knows about rating each movie has
    - MovieService stores the list of all the movies with their ratings
    - each movie has a rating list, which stores all the ratings movie has
    - rating can not exist without a movie (composition)
     */
    private Map<Movie, List<Rating<T>>> moviesList = new HashMap<>();

    public void addMovie(Movie movie, List<Rating<T>> ratings) {
        moviesList.put(movie, ratings);
    }

    public synchronized void addRating(Movie movieName, Rating<T> rating) {
        //find the movie by name (=by key), get the value (=ratingsLIst) and add rating to the ratingList
        if(!moviesList.containsKey(movieName)) {
            moviesList.put(movieName, new ArrayList<>()) ;
        }
        if(rating.getRating().intValue() >= 1 && rating.getRating().intValue() <= 10) {
            moviesList.get(movieName).add(rating);
        } else throw new InvalidRatingException("Invalid rating!");
    }

    public Map<Movie, List<Rating<T>>> returnCopyOfMovieList() {
        return new HashMap<>(moviesList);
    }

    public double calculateMeanRating(Movie movieName) {
        //the method takes all the ratings of a certain movie from the ratingsLIst
        //calculate average and returns this value
        //example: key: "Terminator", value: List.of(99, 100, 80)
        //get the value by key -> list
        //take this list and calculate average
        List<Rating<T>> listOfRatings = moviesList.get(movieName);
        double meanRating;
        meanRating = listOfRatings.stream()
                //take each rating in the list, get the rating value, bring it to double value
                        .mapToDouble(r -> r.getRating().doubleValue())
                //calculate mean value
                .average()
                //manage if the value is 0
                .orElse(0.0);
        movieName.setMeanRating(meanRating);
        return meanRating;
    }

    public Set<Movie> sortMoviesByPopularity() {
        //the method will take the moviesList, get the list of keys (key set?)
        //take value of mean rating of each movie
        //and sort it..
        //"terminator, titanic, romeoAndJuliett"
        Set<Movie> listOfMovieNames = moviesList.keySet();
        return listOfMovieNames.stream()
                .sorted(Comparator.comparing(Movie::getMeanRating).reversed())
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }
}