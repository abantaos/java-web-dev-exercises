package org.launchcode.java.exercises.bankstuff.accounts;

import java.util.ArrayList;

public class CheckingAccount extends BankAccount{

    private double fee;
    private final double overdrawAmount = 5;

    public CheckingAccount(int accountNo, double fee) {
        super(accountNo); //calls parent constructor, sets two fields
        this.fee = fee;
    }

    public void collectFee() {
        this.balance -= this.fee;
    }

    @Override
    public void withdraw(double amount) {
        if(amount < 0 || amount > this.balance + this.overdrawAmount) {
            throw new IllegalArgumentException();
        }
        this.balance -= amount;
    }

    public static void main(String[] args) {
        CheckingAccount dougsChecking = new CheckingAccount(1, 5);
        SavingsAccount dougsSavings = new SavingsAccount(2, 0.0001);
        dougsChecking.deposit(100);
        dougsSavings.deposit(100);

//        dougsChecking.withdraw(101);
//        System.out.println(dougsChecking.getBalance());

        //1000 lines of code later...


//        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
//        accounts.add(dougsChecking);
//        accounts.add(dougsSavings);
//        BankAccount ba1 = accounts.get(0);
//        BankAccount ba2 = accounts.get(1);




        BankAccount ba1 = (BankAccount)dougsChecking; //this is casting
        BankAccount ba2 = (BankAccount)dougsSavings; //taking instance of this child class and casting to parent class

        //treating a checking acct as a bank acct? > polymorphism

        ba1.withdraw(101);
//        CheckingAccount dc2 = (CheckingAccount)ba1;
//        dc2.collectFee();
        System.out.println(ba1.getBalance());

    }

}
