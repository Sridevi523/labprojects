
public class BankAccount {
    private String accountType;
    private double balance;
    public BankAccount(String accountType) {
        this.accountType = accountType;
        this.balance = 0.0;
    }

    public BankAccount(String accountType, double initialBalance) {
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance =balance+ amount;
            System.out.println("Deposited cash: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void deposit(String checkNumber, double amount) {
        if (amount > 0) {
            balance =balance+ amount;
            System.out.println("Deposited check " + checkNumber + ":"+ "" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance =balance-amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount savingsAccount = new BankAccount("Savings");
        BankAccount checkingAccount = new BankAccount("Checking", 500);

        savingsAccount.deposit(400);
        savingsAccount.deposit("Sri123",250);
        savingsAccount.withdraw(100);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        checkingAccount.deposit(1000);
        checkingAccount.deposit("SbI678", 180);
        checkingAccount.withdraw(200);
        System.out.println("Checking Account Balance:" + checkingAccount.getBalance());
    }
}

