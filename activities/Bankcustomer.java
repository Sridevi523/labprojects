import java.util.*;
 class Bankcustomer {
	 int accno;
	 String acctype;
	 int amount;
	public Bankcustomer(int accno, String acctype)
	 {
		this.accno=accno;
		this.acctype=acctype;
		
	 }
	public Bankcustomer(int accno, String acctype,int amount)
	 {
		this.accno=accno;
		this.acctype=acctype;
		this.amount=amount;
	 }
	void display()
	{
		System.out.println("Accno:"+accno+"acctype:"+acctype+  "Amount:" +amount);
	}
	public static void main(String[] args)
	{
		Bankcustomer c1=new Bankcustomer(7634890,"SBI");
		Bankcustomer c2=new Bankcustomer(76348990,"Union",100000);
		c1.display();
		c2.display();
		
	}
	 
	 
}

 