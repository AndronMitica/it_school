package session10_inheritance_and_incapsulation.homework.bankAccountManagementSystem;

public class BankAccountManagementSystem {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Michael");
        BankAccount account2 = new BankAccount("Sarah");

        System.out.println("First account: ");
        account1.deposit(1000);
        account1.withdraw(500);
        account1.getBalance();
        account1.getAccountDetails();
        System.out.println();

        System.out.println("Second account: ");
        account2.deposit(300);
        account2.withdraw(1000);
        account2.getBalance();
        account2.getAccountDetails();
        System.out.println();

        double amountToTransfer = 50;
        System.out.println("Transfer the amount: " + amountToTransfer + " from account1 to account2. ");
        account1.transferFounds(account2, 50);
        System.out.println(account1.getAccountDetails());
        System.out.println();
        System.out.println(account2.getAccountDetails());
    }
}