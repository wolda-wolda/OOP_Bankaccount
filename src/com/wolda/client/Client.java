package com.wolda.client;

import com.wolda.account.Account;

public class Client {
    private static int totalnumber;
    private int clientnumber;
    private String name;
    public Account acc=null;

    public Client(String name){
        totalnumber++;
        this.clientnumber=totalnumber;
        this.name=name;
        System.out.println("Kunde wurde erstellt");
    }

    public void createAccount(int credit, double interest){
        if (acc==null){
            this.acc = new Account(credit, interest);
            System.out.println("Hallo "+ this.name+ " Ihr Konto wurde erstellt, ihr aktueller Kontostand mit Startguthaben: "+ this.acc.getAmount()+ ", Ihr Zinssatz beträgt: "+ this.acc.getInterest()+ ", Sie dürfen bis zu folgendem Betrag abheben: "+ this.acc.getCredit());
        }else{
            System.out.println(this.name+ " Sie besitzen bereits ein Konto");
        }
    }
    public void getInfo(){
        if (this.acc==null){
            this.getClientInfo();
        }else{
            System.out.println("Hallo "+ this.name+ " Kontonummer: "+ this.clientnumber+ ", Ihr aktueller Kontostand beträgt: "+ this.acc.getAmount()+ ", Ihr Zinssatz beträgt: "+ this.acc.getInterest()+ ", Sie dürfen bis zu folgendem Betrag abheben: "+ this.acc.getCredit());
        }

    }
    public void getClientInfo(){
        System.out.println("Hallo "+ this.name+ " Ihre Kontonummer: "+ this.clientnumber);
    }

    public void closeAccount() {
        this.acc.withdraw(-30);
        System.out.println("30€ Gebühr wurden berechnet");
        this.acc.withdraw((int) this.acc.getAmountInt());
        this.acc=null;
    }
}
