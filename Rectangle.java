package be.vdab.DefiningClassesAndCreatingObjects;

public class Rectangle {

    // Define the variables for the rectangle
    private double width;
    private double height;
    private static int count;

    {
        count++;
    }

    // Initialilzation of the counter, happens once when the first rectangle is created
    static {
        count = 0;
    }

    // Construct a rectangle with give dimensions - example of a java constructor
    public Rectangle() {
        width = 1;
        height = 1;
    }

    // Construct a rectangle with a specified width and height - example of a java constructor
    public Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    // Return the width of the rectangle
    public double getWidth() {
        return width;
    }

    // Return the height of the rectangle
    public double getHeight() {
        return height;
    }

    // Return the count value
    public int getCount() {
        return count;
    }

    // Return the area of the rectangle
    public double getArea() {
        return width * height;
    }

    // Return the perimeter of this rectangle
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    // Set a new height for the rectangle
    public void setWidth(double newWidth) {
        width = newWidth;
    }

    // Set a new height for the rectangle
    public void setHeight(double newHeight) {
        height = newHeight;
    }
}
