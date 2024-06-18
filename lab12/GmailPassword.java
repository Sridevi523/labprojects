
class GmailAccount
{
private String pwd;
public void setPassword(String pwd)
{
if(pwd.length()>=8)
{
this.pwd=pwd;
System.out.println("Password Set Successfully");
}
else
{
System.out.println("INVALID PASSWORD.....!");
}
}
}
class GmailPassword
{
public static void main(String[] args) 
{
System.out.println(" Starts");
GmailAccount g= new GmailAccount();
g.setPassword("arjun"
		+ "1234");
System.out.println(" Ends");
}
}