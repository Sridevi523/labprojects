//*Write a program that will take input from user in array and
//*calculate count of even and odd numbers in given array.
//Algorithm:1.import statement 2.class Declaration 3.main method 4.count even and odd
// input:{3,6,8,10,7} output:even count:3 odd count:2


import java.util.Scanner;//import the java Util Package
public class EvenOddCount//class name EvenOddCount
{
	public static void main(String[] args)//main method Start execution
	{
		Scanner sc=new Scanner(System.in);//Dynamic input from user
		int size=sc.nextInt();//integer value of the Array
	  {
		    int a[]=new int[size];//Size of the Array
		    int evenCount = 0;//Store even count 
	        int oddCount = 0;//Store odd count 
		    for(int i=0;i<size;i++)//iterate each element of array element in Array
		    {
		        a[i]=sc.nextInt();//Assign i value from the Array
		    }
		    for(int i=0;i<size;i++)//loop each element in Array
		    {
		    	  if (a[i] % 2 == 0) //check even or odd
		    	  {
		                evenCount++; // Increment the even count
		           } 
		    	  else 
		            {
		                oddCount++; // Increment the odd count
		            }
		    }
		    System.out.print("The Count of Even Array Elements is:");
		    System.out.println(evenCount);//print even count 
		    System.out.print("The Count of Odd Array elements is:");
		    System.out.println(oddCount);// print odd count
		    
	  }
	}
}