import java.util.Scanner;
class PrimeSeries
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int c=0;
        if(n1>0 && n2>0)
        {
            for(int i=n1; i<=n2; i++)
            {
                int fc=0;
                for(int j=1; j<=i; j++)
                {
                    if(i%j==0)
                    {
                        fc++;
                    }
                }
                if(fc==2)
                {
                    c++;
                    if(c!=1)
                    {
                        System.out.print(", ");
                    }
                    
                    System.out.print(i);
                }
            }
        }
       
        
    }
}
       