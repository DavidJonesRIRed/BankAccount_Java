package com.careerdevs;
import static java.lang.System.out;

public class Account {
    private int accountNumber;
    private float balance;
    private int routingNumber;

    public Account(){
        this.accountNumber = 0;
        this.balance = 0.00f;
        this.routingNumber = 0;
    }

    public Account(int newAccountNumber,float newBalance,int newRoutingNumber){
        this.accountNumber = newAccountNumber;
        this.balance = newBalance;
        this.routingNumber = newRoutingNumber;
    }

    public void setAccountNumber(int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }

    public void setRoutingNumber(int newRoutingNumber) {
        this.routingNumber = newRoutingNumber;
    }

    public void showAccountDetails(){
        out.println("This account has an account number " + this.accountNumber + " a routing number " + this.routingNumber + " and a balance of " + this.balance);
    }

}
