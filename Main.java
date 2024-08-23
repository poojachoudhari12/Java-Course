/* Write a program to create a class known as bankaccount with methods called deposite and withdraw create asubclass 
called savingAccount that overrides rhe withdraw method to prevent withdraw if the account balance falls below 100  */
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

 class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 100) {
            System.out.println("Cannot withdraw below $100 minimum balance!");
        } else {
            super.withdraw(amount);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount(1000);
        System.out.println("Bank Account:");
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(1500); 
        
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        System.out.println("\nSavings Account:");
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        savingsAccount.withdraw(900); 
    }
}