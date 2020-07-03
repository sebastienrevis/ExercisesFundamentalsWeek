package be.vdab.DefiningClassesAndCreatingObjects;

public class RectangleTest {

    public static void main(String[] args) {
        // Create a rectangle with width 1 and height 1
        Rectangle rectangle1 = new Rectangle();
        System.out.println("The area of the area of rectangle (" + rectangle1.getWidth() + "x" + rectangle1.getHeight() + ") is: " + rectangle1.getArea());
        System.out.println("The perimeter of the rectangle is: " + rectangle1.getPerimeter());
        System.out.println(rectangle1.getCount());

        // Create a rectangle with width 25 and height 10
        Rectangle rectangle2 = new Rectangle(4, 40);
        System.out.println("The area of the area of rectangle (" + rectangle2.getWidth() + "x" + rectangle2.getHeight() + ") is: " + rectangle2.getArea());
        System.out.println("The perimeter of the rectangle is: " + rectangle2.getPerimeter());
        System.out.println(rectangle2.getCount());

        // Create a rectangle with width 40 and height 10
        Rectangle rectangle3 = new Rectangle(3.5, 35.9);
        System.out.println("The area of the area of rectangle (" + rectangle3.getWidth() + "x" + rectangle3.getHeight() + ") is: " + rectangle3.getArea());
        System.out.println("The perimeter of the rectangle is: " + rectangle3.getPerimeter());
        System.out.println(rectangle3.getCount());

        // Modify rectangle dimensions
        rectangle2.setWidth(100);
        rectangle2.setHeight(100);
        System.out.println("The area of the area of rectangle (" + rectangle2.getWidth() + "x" + rectangle2.getHeight() + ") is: " + rectangle2.getArea());
        System.out.println("The perimeter of the rectangle is: " + rectangle2.getPerimeter());
        System.out.println(rectangle1.getCount());
    }
}
