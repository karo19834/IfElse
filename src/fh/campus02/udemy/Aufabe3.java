package fh.campus02.udemy;

import java.util.Scanner;

public class Aufabe3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte zahl eintippen....");
        double zahl = scan.nextDouble();
        System.out.println( "Ihre zahl lautet: " + zahl);

        Scanner scan2 = new Scanner(System.in);
        System.out.println( "Schreib etwas.... ");
        String zeichenkette =scan2.next();
        System.out.println(" Bitte geben alter: ....");
        int alter= scan2.nextInt();

        System.out.println("Ihre Name: "+zeichenkette+ " Ihre alter: "+ alter);

    }
}
