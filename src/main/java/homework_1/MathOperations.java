package homework_1;

public class MathOperations {

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int a = 3;
        int b = 4;
        int side = 5;
        int seconds = 20;
        int seconds2 = 120;
        double distance = 1000;
        double time = 2;
        double distance2 = 7000;
        double time2 = 8;
        double c = 10;
        double d = 20;
        double c2 = 100.6;
        double d2 = 2000.00;
        double radius = 599.99;
        double radius2 = 1.1;
        double total = 25;
        double part = 14;
        double f = 300.00;

        System.out.println("The sum of " + x + " and " + y + " is " + add(x, y));
        System.out.println("The difference between " + x + " and " + y + " is " + subtract(x, y));
        System.out.println("The result of multiplication  " + x + " by " + y + " is " + multiply(x, y));
        System.out.println("The result of division  " + x + " by " + y + " is " + divide(x, y));
        System.out.println("Between the numbers " + a + " and " + b + " the greater is " + findMax(a, b));
        System.out.println("The difference module of " + x + " and " + y + " is " + difference(x, y));
        System.out.println("The area of a square with side length of " + side + " will be " + squareArea(side));
        System.out.println("The perimeter of a square with side length of " + side + " will be " + squarePerimeter(side));
        System.out.println("It is " + convertSecondsToMinutes(seconds) + " minutes in " + seconds + " seconds ");
        System.out.println("It is " + convertSecondsToMinutes(seconds2) + " minutes in " + seconds2 + " seconds ");
        System.out.println("If distance is " +  distance + " and the time is " + time + " the average speed will be " + averageSpeed(distance, time));
        System.out.println("If distance is " +  distance2 + " and the time is " + time2 + " the average speed will be " + averageSpeed(distance2, time2));
        System.out.println("The length of hypotenuse will be " + findHypotenuse(c, d));
        System.out.println("The length of hypotenuse will be " + findHypotenuse(c2, d2));
        System.out.println("The length of circle with radius of " + radius + " will be " + circleCircumference(radius));
        System.out.println("The length of circle with radius of " + radius2 + " will be " + circleCircumference(radius2));
        System.out.println("The " + part + " of " + total + " will be " + calculatePercentage(total, part) + " percents ");
        System.out.println("If it is " + c + " degrees Celsius it will be " + celsiusToFahrenheit(c) + " degrees in Fahrenheit ");
        System.out.println("If it is " + f + " degrees Fahrenheit it will be " + fahrenheitToCelsius(f) + " degrees in Celsius ");
    }

    static int add(int x, int y) {
        //here the body of method will be
        return x + y;
    }

    static int subtract(int x, int y) {
        return x - y;
    }

    static int multiply(int x, int y) {
        return x * y;
    }

    static double divide(int x, int y) {
        return (double) x / y;
    }

    static int findMax(int a, int b) {
        return Math.max(a, b);

    }

    static int difference(int x, int y) {
        return Math.abs( x - y);
    }

    static int squareArea(int side) {
        return side * side;
    }

    static int squarePerimeter(int side) {
        return side * 4;
    }

    static double convertSecondsToMinutes(int seconds) {
        //30 / 60 = 0.5
        return (double) seconds / 60;
    }

    static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    static double findHypotenuse(double c, double d) {
        return Math.sqrt(Math.pow(c, 2) + Math.pow(d, 2));
    }

    static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    static double calculatePercentage(double total, double part) {
        //11 / 100 * 100
        return part / total * 100;
    }

    static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return  (f - 32) * 5 / 9;
    }


}
