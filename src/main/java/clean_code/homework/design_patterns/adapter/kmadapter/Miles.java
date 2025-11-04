package clean_code.homework.design_patterns.adapter.kmadapter;

public class Miles implements Distance {
    double distance;

    public Miles(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public void printDistance() {
        System.out.println("Distance is: " + distance + " miles");
    }
}