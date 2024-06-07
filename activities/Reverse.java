
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter an integer: ");
		        int n = scanner.nextInt();
		          int rev = 0;
		        for (; n!= 0; n /= 10) {
		            rev= rev * 10 + n % 10;
		        }
		        System.out.println("Reversed int number: " + rev);
		    }
		}