/*
Q6. Create a BankAccount class with:
accountNumber
name
balance
Initialize these using a parameterized constructor.
Create a method withdraw(int amount) that checks:
Amount must be greater than 0
Amount must be <= balance
After withdrawal, update balance
If invalid → print message accordingly
Explanation:
You must apply multiple logical checks together:
*/

import java.util.*;

class BankAccount
 {
    private int accNum, balance;
    private String name;

    
    BankAccount(String name, int accNum, int balance)
	{
        this.name = name;
        this.accNum = accNum;
        this.balance = balance;
    }

    
    public void withdraw(int amount) 
	{
        if (amount > 0) {
            if (amount <= balance) 
			{
                balance -= amount;
                System.out.println("Withdrawal successful! Amount: " + amount);
                System.out.println("Remaining balance: " + balance);
            } 
			else 
			{
                System.out.println("Insufficient balance. Available: " + balance);
            }
        } 
		else 
		{
            System.out.println("Invalid withdrawal amount. Must be greater than 0.");
        }
    }
}

public class Q6Cons 
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name, account number, and balance:");
        String name = sc.next();
        int accNum = sc.nextInt();
        int balance = sc.nextInt();

        BankAccount account = new BankAccount(name, accNum, balance);

        System.out.println("Enter amount to withdraw:");
        int amount = sc.nextInt();

        account.withdraw(amount);
    }
}