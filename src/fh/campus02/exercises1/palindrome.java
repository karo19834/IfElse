package fh.campus02.exercises1;

import java.util.Locale;

public class palindrome {
    public static void main(String[] args) {
//        Was it a car or a cat I saw
//        Murder for a jar of red rum
//        Go hang a salami, I'm a lasagna hog
//        Otto
//        1122332211
        boolean anna =isPalindrome("anna");
        System.out.println((anna));
        System.out.println( isPalindrome("Anna1"));


    }
    public static boolean isPalindrome ( String potentialPalindrome) {
        potentialPalindrome = potentialPalindrome.toLowerCase();
        potentialPalindrome = potentialPalindrome.replace ("'", "");
        potentialPalindrome = potentialPalindrome.replace (",","");
        potentialPalindrome = potentialPalindrome.replace ( " ", "");

        char firstLetter = potentialPalindrome.charAt(0);
        char lastLetter = potentialPalindrome.charAt( potentialPalindrome.length()-1);

        if (firstLetter==lastLetter){
            potentialPalindrome = potentialPalindrome.substring(1, potentialPalindrome.length() -1);

            if (potentialPalindrome.length() <=1){
                return true;
            }
            return isPalindrome(potentialPalindrome);
        }
        return false;
    }
}
