//*Create an array of n elements , sum only positive odd numbers
import java.util.*; 
public class SumofOdd { 
 public static void main(String[] args) { 
 Scanner s=new Scanner(System.in); 
 int size; 
 System.out.println("Enter the size of an array:"); 
 size=s.nextInt(); //size of array
 int a[]=new int[size]; 
 for(int i=0;i<a.length;i++) //legth of array
 { 
 a[i]=s.nextInt(); 
 } 
 int sum=0; 
 for(int j=0;j<a.length;j++) 
 { 
 if(j%2==1) //check the condition odd or not
 sum=sum+a[j]; //get odd number from input and sum the array numbers
 } 
 System.out.println("Sum Of Odd positions : "+sum);
 }
}