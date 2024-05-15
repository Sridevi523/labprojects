
import java.util.Scanner;

class Main{
    
    public static void main(String[]args){
        
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        System.out.print(palindrome(N));
    }
    
    public static String palindrome(int N)
    {
        if(N<0)
        {
            N=N*(-1);
        }
        int dup=N;
        int rev=0;
        while(dup>0)
        {
            int r=dup%10;
            dup=dup/10;
            rev=rev*10+r;
        }
        if(N==rev)
        {
            return "The given number is Palindrome.";
        }
        else
        {
            return "The given number is not a PalinDrome.";
        }
    }
    
}
