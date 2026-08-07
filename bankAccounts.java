package com.constructor;

public class bankAccounts {
	long accountNumber;
    String holderName;
    double balance;

    bankAccounts(long accountNumber, String holderName, double balance) {

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void display() {

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name : " + holderName);
        System.out.println("Balance : ₹" + balance);
    }

    public static void main(String[] args) {

        bankAccounts acc =
                new bankAccounts(1234567890L, "Vinay", 25000);

        acc.display();
    }
}
