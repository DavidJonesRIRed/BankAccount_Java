package com.careerdevs;
import static java.lang.System.out;

public class Checking extends Account{
    private String accountType;

    public void setAccountType(String newAccountType) {
        this.accountType = newAccountType;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public Checking(){
        super();
        this.accountType = "Checking";
    }

    public Checking(int newAccountNumber,float newBalance, int newRoutingNumber){
        super(newAccountNumber, newBalance, newRoutingNumber);
        this.accountType = "Checking";
    }

    public void showCheckingAccount(){
        out.println();
        out.println("This is a " + this.accountType);
        super.showAccountDetails();
    }
}
