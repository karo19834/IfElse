package fh.campus02.udemy;

import java.util.Scanner;

public class Einlesen2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println( " Gib Name ");
        String name = scan.next();
        System.out.println( " Gib Alter ");
        int alter = scan.nextInt();
        System.out.println( "Ihre Name: "+ name + " Ihre Alter: "+ alter);

        scan.close();

    }
}
