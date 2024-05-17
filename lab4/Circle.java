

import java.io.*;
class Circle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String user = "";

        while (true) {
            System.out.println("Enter 'YES' to continue): ");
            user = reader.readLine();

            if (user.equalsIgnoreCase("YES")) {
                System.out.print("Enter the radius of the circle: ");
                String radiusInput = reader.readLine();
                double radius = Double.parseDouble(radiusInput);

                if (radius > 0) {
                    double area = Math.PI * Math.pow(radius, 2);
                    System.out.println("The area of the circle with radius " + radius + " is: " + area);
                } else {
                    System.out.println("The radius must be a positive number.");
                }
            } else {
                break;
            }
        }

    }
}
