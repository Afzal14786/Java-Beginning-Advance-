package Synchronization.Example;

import java.util.Scanner;

class ATM {
    synchronized public void checkBalance(String name) {
        System.out.print(name + " Checking . . . ");
        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("Balance");
    }

    synchronized public void withdwarAmount(String name, int amount) {
        System.out.print(name + " Withdraw ");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(amount + " $");
    }
}

class Customer extends Thread{
    String name;
    int amount;
    ATM atm;

    Customer(String name, ATM atm, int amount) {
        this.name = name;
        this.atm = atm;
        this.amount = amount;
    }

    public void useATM() {
        atm.checkBalance(name);
        atm.withdwarAmount(name, amount);
    }

    @Override
    public void run() {
        useATM();
    }
}

public class ATMExample {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name;
        int amount;
        ATM atm = new ATM();

        System.out.println("Enter Your Name : ");
        name = scn.nextLine();
        System.out.println("Enter Your Amount : ");
        amount = scn.nextInt();


        Customer cs = new Customer(name, atm, amount);
        cs.start();
    }
}

