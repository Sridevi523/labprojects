public class CircleRadius {
    private double radius;
    public CircleRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

   
    public static void main(String[] args) {
       
        CircleRadius circle = new CircleRadius(5.0);

        double area = circle.calculateArea();
        System.out.println("The area of the circle is: " + area);
    }
}
