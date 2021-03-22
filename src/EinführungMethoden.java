

import java.util.Scanner;

public class EinführungMethoden {

    public static void main(String[] args) {  //Klasse

        int balance = 1600, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        while (true) {

            printMenu(); //Menü

            int n = s.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.print("Wie viel wollen sie abheben:");
                    withdraw = s.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Bitte nehmen sie ihr geld raus");
                    } else {
                        System.out.println("Zu wenig geld auf dem Konto hahaha du bist arm");
                    }
                    System.out.println(" ");
                }
                case 2 -> {
                    System.out.print("Wie viel Wollen sie einzahlen:");
                    deposit = s.nextInt();
                    balance = balance + deposit;
                    System.out.println("Ihr geld wurde erfolgreich eingezahlt");
                    System.out.println(" ");
                }
                case 3 -> {
                    System.out.println("Balance : " + balance);
                    System.out.println(" ");
                }
                case 4 -> System.exit(0);
            }
        }
    }

    public static void printMenu() {
        System.out.println("Herzlich willkommen beim Bankautomat");
        System.out.println("1.Abhebnung");
        System.out.println("2.Einzahlen");
        System.out.println("3.Kontostand checken");
        System.out.println("4.Ausloggen");
        System.out.println("Was für eine Anwendung wollen sie starten");

    }
}

