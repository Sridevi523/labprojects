//*WAP to find the largest and smallest element in the given array
//algorithm:1.Declare import Statement 2Class Declaration 3.Main Method 4.Finding maximum Element
//5.Finding Minimum Element 6.Printing Results
//Input:[66,89,74,32,20] Output:[Largest no:89 Smallest no:20]


import java.util.Scanner;//import the java Util Package
class LargestandSmallest////class name LargestandSmallest
{
	public static void main(String[] args)//main method Start execution
	{
		Scanner sc=new Scanner(System.in);//Dynamic input from user
		int size=sc.nextInt();//integer value of the Array
	{
		    int a[]=new int[size];//Size of the Array
		    for(int i=0;i<size;i++)//iterate each element of array element in Array
		    {
		        a[i]=sc.nextInt();//Assign i value from the Array
		    }
		    int max=a[0]; // Initialize max with the first element of the array
		    for(int i=0;i<size;i++) // Loop to find the maximum element in the array
		      {
		        if(max<a[i]) // Compare current element with max
		        {
		            max=a[i]; // Update max if current element is greater
		        }
             }
		    int min=a[0]; // Initialize minimum with the first element of the array
		    for(int i=0;i<size;i++)// Loop to find the minimum element in the array
		    {
		        if(a[i]<min)// Compare current element with minimum
		        {
		            min=a[i];// Update minimum if current element is smaller
		        }
		    }
		    System.out.println("Smallest number of Array:");// Print the smallest number in the array
            System.out.println(min);
            System.out.println("Largest number of Array");// Print the largest number in the array
            System.out.println(max);
            
		}
	}
}
