package atm;

import bank. AccountDetails; 
public class DetailsAccount {
    public static void main(String[] args) {
    	AccountDetails account = new  AccountDetails("SBI",8745232,10000);
        account.Bankname(); 
        account.Accountnumber();
        account.Ifsccode();
    }
}
