package complex_tasks.task4;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieServiceTest {
    //addRating
    @Test
    public void userCanAddValidRating() {
        //expected result = 10
        //Terminator, ListOf()
        Movie terminator = new Movie("Terminator");
        MovieService<Integer> service = new MovieService<>();
        service.addMovie(terminator, new ArrayList<>());
        service.addRating(terminator, new Rating<>(10));
        assertEquals(10, service.returnCopyOfMovieList().get(terminator).getFirst().getRating());
    }

    @Test
    public void userCanAddValidRatingIfThereIsNoMovieYet() {
        MovieService<Integer> service = new MovieService<>();
        Movie terminator = new Movie("Terminator");
        service.addRating(terminator, new Rating<>(10));
        assertEquals(10, service.returnCopyOfMovieList().get(terminator).getFirst().getRating());
    }

    //calculateMeanRating
    @Test
    public void userCanCalculateMeanRating() {
        //ER: 4
        Movie terminator = new Movie("Terminator");
        MovieService<Integer> service = new MovieService<>();
        service.addMovie(terminator, new ArrayList<>());
        service.addRating(terminator, new Rating<>(10));
        service.addRating(terminator, new Rating<>(1));
        service.addRating(terminator, new Rating<>(1));
        assertEquals(4, service.calculateMeanRating(terminator));
    }

    //sortMoviesByPopularity
    @Test
    public void userCanSortMoviesByPopularity() {
        //ER: list(Terminator, Titanic, Harry Potter)
        MovieService<Integer> service = new MovieService<>();
        Movie terminator = new Movie("Terminator");
        Movie titanic = new Movie("Titanic");
        Movie harryPotter = new Movie("Harry Potter");
        List<Rating<Integer>> terminatorRatings = List.of(
                new Rating<>(7),
                new Rating<>(8),
                new Rating<>(9)
        );

        List<Rating<Integer>> titanicRatings = List.of(
                new Rating<>(9),
                new Rating<>(8),
                new Rating<>(9)
        );

        List<Rating<Integer>> harryPotterRatings = List.of(
                new Rating<>(10),
                new Rating<>(10),
                new Rating<>(10)
        );

        service.addMovie(terminator, terminatorRatings);
        service.addMovie(titanic, titanicRatings);
        service.addMovie(harryPotter, harryPotterRatings);

        service.calculateMeanRating(terminator);
        service.calculateMeanRating(titanic);
        service.calculateMeanRating(harryPotter);

        List<Movie> expected = List.of(harryPotter, titanic, terminator);
        List<Movie> actual = new ArrayList<>(service.sortMoviesByPopularity());

        assertEquals(expected, actual);
    }
}