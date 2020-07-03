package be.vdab.GeometricInheritance;

public class CircleInheritanceTest {

    public static void main(String[] args) {
        // Create a circle with radius 25
        Circle circle1 = new Circle(25);
        System.out.println("The area of a circle with radius = " + circle1.radius + " is: " + circle1.getArea());
        System.out.println("The color of the circle is: " + circle1.getColor());
        System.out.println("It was created on: " + circle1.getDateCreated());

    }
}

