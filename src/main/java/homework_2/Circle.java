package homework_2;

public class Circle {
    double radius;
    double area;
    double circumference;

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    double calculateArea() {
        return this.area = Math.PI * Math.pow(this.radius, 2);
    }

    double calculateCircumference() {
        return this.circumference = 2 * Math.PI * this.radius;
    }
}
