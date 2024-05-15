import java.util.*;
public class Swap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum;
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		num1 = num1 + num2; 
		num2 = num1 - num2; 
        num1 = num1 - num2;
        sum=num1+num2;
        System.out.print(sum);

		
		
		
	}

}
