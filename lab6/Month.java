import java.util.Scanner;
public class Month {

    
  public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int month = sc.nextInt();

        System.out.println(getMonthName((month)));
    }

    public static String getMonthName(int month) {
        String MonthName = "";
        switch (month) {
            case 1: MonthName = "jan"; break;
            case 2:MonthName = "feb"; break;
            case 3: MonthName = "mar"; break;
            case 4: MonthName = "april"; break;
            case 5:MonthName = "may"; break;
            case 6:MonthName = "june"; break;
            case 7: MonthName = "july"; break;
            case 8:MonthName = "aug"; break;
            case 9: MonthName= "sep"; break;
            case 10: MonthName = "oct"; break;
            case 11: MonthName = "nov"; break;
            case 12: MonthName = "dec"; break;
            default:MonthName = "Invalid month range";
        }

        return MonthName;
    }
}
