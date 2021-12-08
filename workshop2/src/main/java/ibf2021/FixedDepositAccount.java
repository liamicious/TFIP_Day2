package ibf2021;

public class FixedDepositAccount extends BankAccount {
    private float interest = 3;
    private int durationInMonths = 6;
    private boolean isInterestChanged = false;
    private boolean isDurationChanged = false;

    public FixedDepositAccount(String name, Float balance){
        //super.setAccountBalance(balance);
        super(name, balance);
    }

    public FixedDepositAccount(String name, Float balance, Float interest){
        super(name, balance);
        //TODO:
    }

    public FixedDepositAccount(String name, Float balance, Float interest, Integer duration){
        super(name, balance);
        //TODO:
    }

    public FixedDepositAccount(String name){
        super(name);
    }

    @Override
    public void deposit(float amount){
    }

    @Override
    public void withdraw(float amount){
    }

    // This function can only be done once
    public void setInterest(float interest){
        // Check if boolean flag is true
        if(isInterestChanged)
            throw new IllegalArgumentException();

        this.interest = interest;
        isInterestChanged = true;
    }

    // This function can only be done once
    public void setDurationInMonths(int durationInMonths){
        // Check if boolean flag is true
        if(isDurationChanged == true)
            throw new IllegalArgumentException();

        this.durationInMonths = durationInMonths;
        isDurationChanged = true;
    }
}