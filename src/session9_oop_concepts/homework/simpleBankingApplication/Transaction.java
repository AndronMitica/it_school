package session9_oop_concepts.homework.simpleBankingApplication;

public class Transaction {
    private String transactionType;
    private double transactionAmount;
    private double availableBalance;

    public Transaction(String transactionType, double transactionAmount, double availableBalance) {
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
        this.availableBalance = availableBalance;
    }

    @Override
    public String toString() {
        return transactionType + " in amount of " + transactionAmount + " balance after " + availableBalance;
    }
}