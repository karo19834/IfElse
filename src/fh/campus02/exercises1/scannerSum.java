package fh.campus02.exercises1;

import java.util.Scanner;

public class scannerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println( "Enter a number ");

        int number = scanner.nextInt();
        int sum = 0;

        while ( number > 0) {
            if ( number ==2){
               sum= sum*2;
                System.out.println( "double bonus! ");
                System.out.println(  "enter another number: ");
                number= scanner.nextInt();
            }else if ( number == 3){
                sum= sum*3;
                System.out.println( "tripple bonus! ");
                System.out.println(  "enter another number: ");
                number= scanner.nextInt();
            }else if ( number ==22) {
                sum = sum /2;
                System.out.println( "sum halved. ");
                System.out.println( "Enter anoter number:" );
                number= scanner.nextInt();
            } else {
                // sum = sum + number
                sum+= number;
                System.out.println( "Enter another number ");
                number = scanner.nextInt();
            }
        }
        System.out.println("Your total sum is: " + sum);
        scanner.close();
    }
}
