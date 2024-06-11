import java.util.*;
abstract class Shape1 {
    abstract double calculation();
}
class Rectangle extends Shape{
	double length;
    double breath;
    Rectangle(double length,double breath){
    	this.length=length;
    	this.breath=breath;
    }
	double calculation() {
		return length*breath;
	}
	
}
class Circle extends Shape{
      double radius;
      Circle(double radius) {
          this.radius = radius;
      }
	double calculation() {
		return Math.PI*radius*radius;
	}
}
	public class Shape{
public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		  System.out.println("Choose shape to calculate area (Rectangle/Circle):");
	        String choice = sc.nextLine().toLowerCase();
	        switch (choice) {
            case "rectangle":
                System.out.println("Enter length:");
                double length = sc.nextDouble();
                System.out.println("Enter breath:");
                double breath = sc.nextDouble();
                Rectangle rec= new Rectangle(length, breath);
                System.out.println("Area of Rectangle: " +rec.calculation());
                break;
            case "circle":
                System.out.println("Enter radius:");
                double radius = sc.nextDouble();
                Circle cir = new Circle(radius);
                System.out.println("Area of Circle: " + cir.calculation());
                break;
            default:
                System.out.println("Enter valid choice!");
                break;
        }
	}
}
