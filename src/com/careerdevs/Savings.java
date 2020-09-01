package com.careerdevs;
import static java.lang.System.out;

public class Savings extends Checking{
    private float interestRate;

    public Savings(){
        super();
        super.setAccountType("Savings");
        this.interestRate = .05f;
    }

    public Savings(int newAccountNumber,float newBalance, int newRoutingNumber){
        super(newAccountNumber,newBalance,newRoutingNumber);
        super.setAccountType("Savings");
        this.interestRate = .05f;
    }

    public void setInterestRate(float newInterestRate) {
        this.interestRate = newInterestRate;
    }

    public float getInterestRate() {
        return this.interestRate;
    }

    public void showSavingsAccount(){
        super.showCheckingAccount();
        out.println("The interest rate in your savings is " + this.interestRate);
    }
}
