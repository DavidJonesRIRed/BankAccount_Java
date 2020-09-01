package com.careerdevs;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Account myAccount = new Account(123456789, 20.00f,987654321);

        myAccount.showAccountDetails();

        Checking myChecking = new Checking(123456788, 25.00f,987654322);

        myChecking.showCheckingAccount();

        Savings mySavings = new Savings(123456787, 15.00f,987654323);
        mySavings.showSavingsAccount();
    }
}
