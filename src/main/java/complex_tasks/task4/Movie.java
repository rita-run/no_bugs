package complex_tasks.task4;

public class Movie {
    private String name;
    private double meanRating;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getMeanRating() {
        return meanRating;
    }

    public void setMeanRating(double meanRating) {
        this.meanRating = meanRating;
    }
}
