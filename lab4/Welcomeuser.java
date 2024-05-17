
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Welcomeuser {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter your name: ");
        
        try {
            String name = reader.readLine();
            System.out.println("Welcome, " + name + "!");
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        }
    }
}