
public class Student {
	
	String name;
	int id;
	int age;
	int roll;
	String branch;
	int marks;
	public Student(String Sname,int Sid,int Sage,int Sroll,String Sbranch,int Smarks)
	{
		name=Sname;
		id=Sid;
		age=Sage;
		roll=Sroll;
		branch=Sbranch;
		marks=Smarks;
		
	}
	public static void main(String[] args)
	{
		System.out.println("enter student details:");
		Student s1=new Student("sri",13,22,523,"cse",100);
		System.out.println(s1.name+" "+s1.id+" "+s1.age+" "+s1.roll+" "+s1.branch+" "+s1.marks);
		Student s2=new Student("madhuri",14,22,533,"cse",90);
		System.out.println(s2.name+" "+s2.id+" "+s2.age+" "+s2.roll+" "+s2.branch+" "+s2.marks);
		
	}
	

	
}
