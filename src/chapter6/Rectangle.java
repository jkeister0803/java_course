package chapter6;

public class Rectangle {

    private double length;
    private double width;

    // Default constructor:
    public Rectangle() {
        length = 0;
        width = 0;
    }

    // Constructor with known values for L & W:
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Without an access modifier, classes within the same package can access this method,
    // however the "public" access modifier is necessary for this to be accessible outside of this package.
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    public double calculateArea() {
        return length * width;
    }
}
