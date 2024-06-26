import java.util.*;
public class Geometry {
    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static double volumeOfBox(double length, double width, double height) {
        return length * width * height;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nGeometry Calculator");
            System.out.println("1. Calculate area of a rectangle");
            System.out.println("2. Calculate area of a circle");
            System.out.println("3. Calculate volume of a box");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    double areaRectangle = Geometry.areaOfRectangle(length, width);
                    System.out.println("The area of the rectangle is " + areaRectangle);
                    break;
                case 2:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    double areaCircle = Geometry.areaOfCircle(radius);
                    System.out.println("The area of the circle is " + areaCircle);
                    break;
                case 3:
                    System.out.print("Enter the length of the box: ");
                    double boxLength = scanner.nextDouble();
                    System.out.print("Enter the width of the box: ");
                    double boxWidth = scanner.nextDouble();
                    System.out.print("Enter the height of the box: ");
                    double boxHeight = scanner.nextDouble();
                    double volumeBox = Geometry.volumeOfBox(boxLength, boxWidth, boxHeight);
                    System.out.println("The volume of the box is " + volumeBox);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
