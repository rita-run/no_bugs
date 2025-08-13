package homework_3;

public class MathConstants {
    final double PI = 3.14159;
    final double E = 2.71828;
    static double area;
    static double circumference;

    static double calculateCircleArea(double r) {
        return area = Math.PI * Math.pow(r, 2);
    }

    static double calculateCircumference(double r) {
        return circumference = 2 * Math.PI * r;
    }

}
