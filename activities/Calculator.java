
import java.util.Scanner;
class Calculator
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        char s=sc.next().charAt(0);
        switch(s)
        {
            case '+' :
            	System.out.print("result is a and b:");
                System.out.println( a+b);
                break;
            case '-' :
            	System.out.print("result is a and b:");
                System.out.println(a-b);
                break;
            case '*' :
            	System.out.print("result is a and b:");
                System.out.println(a*b);
                break;
            case '/' :
             if(b==0) {
                System.out.println("Error:division by zero");
                break;
             }else
             {
            	 System.out.print("result is a and b:");
            	 int c=a/b;
            	 System.out.print(c);
             }
            	
            case '%' :
                System.out.println(a%b);
                break;
        }
    }
}