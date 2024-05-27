import java.util.*;
import java.util.Scanner;
class Employee {
static int eid;
static String ename;
static String companyname;
static void EmpDetails(int id, String name, String company)
{
	eid = id;
    ename = name;
    companyname = company;
}
		
static void displayEmp() {
    System.out.println("Employee ID: " + eid);
    System.out.println("Employee Name: " + ename);
    System.out.println("Company Name: " + companyname);
}
 public static void main(String[] args) {
        Employee emp=new Employee();
        emp.EmpDetails(103, "Sri", "anudeep");

        emp.displayEmp();
    }
}