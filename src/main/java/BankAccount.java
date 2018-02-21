import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public void setAccountNember(final int accountNumber1) {
        this.accountNumber = accountNumber1;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountType(final BankAccountType accountType1) {
        this.accountType = accountType1;
    }
    public BankAccountType getAccountType() {
        return accountType;
    }
    public void setAccountBalance(final double accountBalance1) {
        this.accountBalance = accountBalance1;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setOwnerName(final String ownerName1) {
        this.ownerName = ownerName1;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setInterestRate(final double interestRate1) {
        this.interestRate = interestRate1;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestEarned(final double interestEarned1) {
        this.interestEarned = interestEarned1;
    }
    public double getInterestEarned() {
        return interestEarned;
    }

    public BankAccount(final String name, final BankAccountType accountCategory) {

    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}