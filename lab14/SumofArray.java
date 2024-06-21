//*Calculate sum of array elements 
//*Algorithm:1 class declaration 2.Main Method 3.Calculate Sum of Array Elements
//*Input:[4,8,9,2] output:23

import java.util.*;//import the java Util Package
class SumofArray //class name SumofArray
{
	public static void main(String[] args)//main method Start execution
	{
		Scanner sc=new Scanner(System.in);//Dynamic input from user
		int size=sc.nextInt();//integer value of the Array
	  {
		    int a[]=new int[size];//Size of the Array
		    int sum=0;//initialize sum of elements value Start with 0
		    for(int i=0;i<size;i++)//iterate each element of array element in Array
		    {
		        a[i]=sc.nextInt();//Assign i value from the Array
		        sum=sum+a[i];//Add the element to the sum
		    }
		    System.out.print("The sum of Array elements is:"+sum);//print the result of the sum
		    
	   }
	}
}
	