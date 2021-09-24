package com.wolda.account;

import com.wolda.client.Client;

public class Account {
    private double amount;
    private int credit;
    private double interest;

    public Account(int credit, double interest) {
        this.amount = 10;
        this.credit = -credit;
        this.interest =  interest/100;
    }
    public void deposit(int money){
        this.amount=this.amount+money;
    }
    public int withdraw(int money){
        if (this.amount-money<this.credit){
            return 1;
        }
        this.amount=this.amount-money;
        return 0;
    }

    public String getAmount() {
        return String.valueOf(amount+"€");
    }

    public String getInterest() {
        double interestString;
        if (interest<1){
            interestString=interest*100;
            return String.valueOf(interestString+"%");
        }else{
            return null;
        }
    }

    public String getCredit() {
        return String.valueOf(credit+"€");
    }
    public void moneyTransfer(Client k, int amount){
        int temp;
        temp=this.withdraw(amount);
        if (temp==1){
            System.out.println("Für diese Operation ist Ihr Konto nicht ausreichend gedeckt");
        }else{
            k.acc.deposit(amount);
            System.out.println("Überweißung erfolgreich");
        }
    }
    public void withdrawInterest(){
        if (amount>0){
            amount=amount+(amount*interest);
            System.out.println("Zinsen gutgeschrieben "+ this.getAmount());
        }
    }

}
