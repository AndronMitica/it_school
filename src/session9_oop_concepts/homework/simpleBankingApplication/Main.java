package session9_oop_concepts.homework.simpleBankingApplication;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Billy", "savings", 5000.0);

        account.deposit(500.0);
        account.withdraw(250.0);
        account.deposit(150.0);
        account.withdraw(2000.0);

        System.out.println("Current balance: " + account.getBalance());
        account.printTransactionSummary();
    }
}