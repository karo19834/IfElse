package fh.campus02.exercises1;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner buchstaben = new Scanner(System.in);
        System.out.println("write a letter: ");
        String letter = buchstaben.next();


        while (!letter.equals("0")) {
            checkIfVowel(letter);
            System.out.println("Enter next letter ");
            letter = buchstaben.next();
        }
           /* if (letter.equals("a") || letter.equals("e") || letter.equals("o") || letter.equals("i") || letter.equals("y") || letter.equals("u")) {
                System.out.println(" Your letter is vowel.");
                System.out.println("write the next letter:");
                letter = buchstaben.next();
            } else {
                System.out.println("Your letter is not vowel. ");
                System.out.println( " write the next letter: ");
                letter = buchstaben.next();*/


        System.out.println(" It is zero!! ");
        buchstaben.close();
    }


    public static void checkIfVowel(String letter) {
        if (letter.equals("a") || letter.equals("e") || letter.equals("o") || letter.equals("i") || letter.equals("y") || letter.equals("u")) {
            System.out.println(" Your letter is vowel.");

        } else {
            System.out.println("Your letter is not vowel. ");

        }
    }

}