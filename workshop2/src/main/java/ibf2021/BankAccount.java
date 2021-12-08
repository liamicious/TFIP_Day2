package ibf2021;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class BankAccount {
/* BankAccount class
account holder’s name and account number are read only properties. They are set when this class is created and cannot be changed during the lifetime of the instance. */

    private String name;
    private String accountNumber;
    private float accountBalance;
    private List<String> transactions;
    private boolean closed;
    private String createDate;
    private String closeDate;

    // 1st constructor (account balance = 0)
    public BankAccount(String name, float accountBalance){
        this.name = name;
        this.accountBalance = accountBalance;
        transactions = new ArrayList<>();
    }

    // 2nd constructor 
    public BankAccount(String name){
        this.name = name;
        this.accountBalance = 0f;
        // Assume acc number is 9 digit number
        this.accountNumber = Integer.toString( (int) (Math.random()*10000000));
        transactions = new ArrayList<>();
    }
    
    //=====================================================================================================================//
    //                                                    Getters and Setters                                              //
    //=====================================================================================================================//
    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return float return the accountBalance
     */
    public float getAccountBalance() {
        return accountBalance;
    }

    /**
     * @param accountBalance the accountBalance to set
     */
    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * @return List<String> return the transactions
     */
    public List<String> getTransactions() {
        return transactions;
    }

    /**
     * @param transactions the transactions to set
     */
    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    /**
     * @return boolean return the isClosed
     */
    public boolean isIsClosed() {
        return closed;
    }

    /**
     * @param isClosed the isClosed to set
     */
    public void setIsClosed(boolean closed) {
        this.closed = closed;
    }

    /**
     * @return String return the createDate
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate the createDate to set
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     * @return String return the closeDate
     */
    public String getCloseDate() {
        return closeDate;
    }

    /**
     * @param closeDate the closeDate to set
     */
    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }
    //=====================================================================================================================//
    //                                              End of Getters and Setters                                             //
    //=====================================================================================================================//

    public void deposit(float amount){
        // Check for positive deposit amount and closed acc
        if(amount <0 || closed)
            throw new IllegalArgumentException();
        String transaction = "Deposit " + amount + "at " + Calendar.getInstance().getTimeInMillis();

        // update transaction into "transactions" array
        transactions.add(transaction);

        // Same as this.accountBalance = this.accountBalance + amount;
        this.accountBalance += amount;
    }

    public void withdraw(float amount){
        // check for incorrect (negative or number greater than balance) amount and closed acc
        if(amount <0 || amount < accountBalance || closed)
        throw new IllegalArgumentException();
        String transaction = "Withdraw " + amount + "at " + Calendar.getInstance().getTimeInMillis();

        // update transaction into "transactions" array
        transactions.add(transaction);

        // Same as this.accountBalance = this.accountBalance - amount;
        this.accountBalance -= amount;
    }
}
