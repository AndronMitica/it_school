package session10.homework.bankAccountManagementSystem;

import java.util.UUID;

public class BankAccount {
    private final String accountHolderName;
    private final UUID accountNumber;
    private double balance;

    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = UUID.randomUUID();
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            this.balance += amount;
            System.out.println("Account: " + accountNumber + "deposit" + amount);
        } else {
            System.out.println("Fail! The amount should be positive");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0) {
            if (this.balance >= amount) {
                this.balance -= amount;
                System.out.println("The balance after withdraw is: " + balance);
            } else {
                System.out.println("Insufficient founds! You need to deposit some fonds first. ");
            }
        } else {
            System.out.println("Insufficient founds! You need to deposit some fonds first. ");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountDetails() {
        return ("Account holder name: " + accountHolderName + "\n" + "Account number: " + accountNumber + "\n" + "Current balance: " + balance);
    }

    public void transferFounds(BankAccount targetAccount, double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                targetAccount.deposit(amount);
                System.out.println("Transferred amount " + amount + " to account " + targetAccount.accountNumber);
            } else {
                System.out.println("Insufficient founds! You need to deposit some fonds first.");
            }
        } else {
            System.out.println("Insufficient founds! You need to deposit some fonds first.");
        }
    }
}