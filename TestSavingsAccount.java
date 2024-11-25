/*Title: Create class SavingsAccount. Use a static variable annualInterestRate to store the
annual interest rate for all account holders. Each object of the class contains a private
instance variable savingsBalance indicating the amount the saver currently has on deposit.
Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying
the savingsBalance by annualInterestRate divided by 12this interest should be added to
savingsBalance. Provide a static method modifyInterestRate that sets the
annualInterestRate to a new value.
Write a program to test class SavingsAccount. Instantiate two savingsAccount objects,
saver1 and saver2, with balances of Rs 2000.00 and Rs 3000.00, respectively. Set
annualInterestRate to 4%, then calculate the monthly interest and print the new balances
for both savers. Then set the annualInterestRate to 5%, calculate the next month's interest
and print the new balances for both savers.*/

class SavingsAccount
{
    private static Double annualInterestRate;
    private Double savingsBalance;

    public SavingsAccount(double initialBalance) {
        this.savingsBalance = initialBalance;
    }  

    public void calculateMonthlyInterest()
    {
        Double monthlyInterst=(savingsBalance*annualInterestRate)/12;
        savingsBalance=savingsBalance+monthlyInterst;
    }
    public static void modifyInterestRate(Double newRate)
    {
        annualInterestRate=newRate;
    }
    public double getBalance()
    {
        return savingsBalance;
    }
}

public class TestSavingsAccount
{
    public static void main(String[] args)
    {
        SavingsAccount saver1=new SavingsAccount(2000);
        SavingsAccount saver2=new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("Saving balance for saver1: "+saver1.getBalance());
        System.out.println("Saving balance for saver2: "+saver2.getBalance());
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Balances after 4% interest:");
        System.out.println("Saver1: " + saver1.getBalance());
        System.out.println("Saver2: " + saver2.getBalance());
        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest(); 
        System.out.println("Balances after 5% interest:");
        System.out.println("Saver1: " + saver1.getBalance());
        System.out.println("Saver2: " + saver2.getBalance());
    }
}
