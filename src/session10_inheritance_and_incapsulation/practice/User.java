package session10_inheritance_and_incapsulation.practice;

public class User {

    private String firstName;
    private String lastName;
    private String bankAccount;

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
}
