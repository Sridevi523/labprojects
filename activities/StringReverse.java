
public class StringReverse { 
public static void main(String[] args) { 
 String actual="java"; 
 String rev=""; 
 for(int i=actual.length()-1;i>=0;i--) 
 { 
 rev=rev+actual.charAt(i); 
 } 
 System.out.println("reverse of a string is : "+rev);
}
}