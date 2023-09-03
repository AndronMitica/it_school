package session11.homework.bank;

public class BankMain {

    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        bankA.deposit(100);
        bankB.deposit(150);
        bankC.deposit(200);

        System.out.println("Bank A balance: " + bankA.getBalance() + "$");
        System.out.println("Bank B balance: " + bankB.getBalance() + "$");
        System.out.println("Bank C balance: " + bankC.getBalance() + "$");
    }
}