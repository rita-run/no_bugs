package homework_2;

public class Car {
    String brand;
    int year;

    Car(String someBrand, int someYear) {
        this.brand = someBrand;
        this.year = someYear;
    }

    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    String getBrand() {
        return this.brand;
    }

    void setYear(int newYear) {
        this.year = newYear;
    }

    int getYear() {
        return this.year;
    }

    void print() {
        System.out.println("Brand " + this.brand + ", age " + this.year);
    }
}
