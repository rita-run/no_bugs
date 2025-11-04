package clean_code.homework.design_patterns.adapter.kmadapter;

public class Kilometers implements Distance {
    private double distance;

    public Kilometers(double distance) {
        this.distance = distance;
    }

    @Override
    public void printDistance() {
        System.out.println("Distance is: " + distance + " kilometers");
    }
}