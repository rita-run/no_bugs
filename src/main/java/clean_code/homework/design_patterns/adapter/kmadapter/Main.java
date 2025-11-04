package clean_code.homework.design_patterns.adapter.kmadapter;

public class Main {
    public static void main(String[] args) {
        Miles miles = new Miles(10);
        miles.printDistance();

        MilesToKilometersAdapter milesToKilometersAdapter = new MilesToKilometersAdapter(miles);
        Kilometers kilometers = milesToKilometersAdapter.convertMilesToKilometers();
        kilometers.printDistance();
    }
}