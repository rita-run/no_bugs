package clean_code.homework.design_patterns.adapter.kmadapter;

public class MilesToKilometersAdapter {
    private Miles miles;

    public MilesToKilometersAdapter(Miles miles) {
        this.miles = miles;
    }

    public Kilometers convertMilesToKilometers() {
        double kmValue = miles.getDistance() * 1.609344;
        return new Kilometers(kmValue);
    }
}