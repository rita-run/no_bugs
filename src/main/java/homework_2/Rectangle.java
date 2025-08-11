package homework_2;

public class Rectangle {
    int width;
    int height;
    int area;

    Rectangle(int someWidth, int someHeight) {
        this.width = someWidth;
        this.height = someHeight;
        calculateArea();
    }

    int getWidth() {
        return this.width;
    }

    int getHeight() {
        return this.height;
    }

    void setWidth(int newWidth) {
        this.width = newWidth;
        calculateArea();
    }

    void calculateArea() {
        area = this.width * this.height;
    }

    void print() {
        System.out.println(" Area " + this.area);
    }

}
