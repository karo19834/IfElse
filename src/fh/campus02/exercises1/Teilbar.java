package fh.campus02.exercises1;

public class Teilbar {
    public static void main(String[] args) {
        int firstnumber = 76;
        int secondnumber = 3;

        int result = firstnumber % secondnumber ;

        if (result ==0 ) {
            System.out.println( "Zahl ist dividierbar durch 3. ");
        }else System.out.println( " Zahl ist nicht dividierbar durch 3. ");
    }
}
