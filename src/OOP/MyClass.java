package OOP;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("Enter the radius of the circle: ");
        circle.radius = scanner.nextDouble();
        System.out.println("The area of the circle is:  " + circle.getArea(circle.radius));
        System.out.println("The perimeter of the circle is: " + circle.getPerimeter(circle.radius));

        Square square = new Square();
        System.out.println("Enter the size of the side of the square: ");
        square.side = scanner.nextDouble();
        System.out.println("The area of the square is: " + square.getArea(square.side));
        System.out.println("The perimeter of the square is: " + square.getPerimeter(square.side));
    }
}
