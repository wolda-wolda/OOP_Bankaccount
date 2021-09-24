package com.wolda;

import java.util.Scanner;
import com.wolda.client.Client;
import com.wolda.account.Account;
public class Main {

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //String name = scan.nextLine();

        Client k1 = new Client("Jack");
        Client k2 = new Client("Jones");

        k1.getClientInfo();
        k2.getClientInfo();

        k1.createAccount(0, 0.25);
        k1.createAccount(10, 0.30);
        k2.createAccount(200, 0.5);

        k1.getInfo();
        k2.getInfo();

        k1.acc.withdraw(100);
        k2.acc.deposit(500);

        k1.getInfo();
        k2.getInfo();

        k2.acc.moneyTransfer(k1, 500);
        k1.getInfo();
        k2.getInfo();
        k1.acc.moneyTransfer(k2, 100);
        k1.getInfo();
        k2.getInfo();
        k2.acc.moneyTransfer(k1, 500);
        k2.closeAccount();
        k1.acc.withdrawInterest();

        k1.getInfo();
        k2.getInfo();

        k1.getClientInfo();
        k2.getClientInfo();
        /*
        k1.getClientInfo();

        k1.createAccount();
        k2.createAccount();
        k1.getInfo();
        k2.getInfo();
        System.out.println();
        k1.acc.moneyTransfer(k2, 100);

        k1.getInfo();
        k2.getInfo();
        k1.acc.withdrawInterest();
         */

    }
}
