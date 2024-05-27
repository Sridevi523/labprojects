import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 25;
        int num3 = 20;
        int largest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        System.out.println("The largest number is: " + largest);
    }
}
