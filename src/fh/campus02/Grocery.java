package fh.campus02;

public class Grocery {
    public static void main(String[] args) {
        int alcoholicdrink = 0;
        int nonalcoholicdrink = 1;
        boolean discount= grocerydiscount(alcoholicdrink, nonalcoholicdrink);

        System.out.println( "Ich kriege rabatt für mein Getränk: "+ discount);
    }
    public static boolean grocerydiscount ( int alcoholicdrink, int nonalcoholicdrink)
    {
        boolean discount;
        if ( nonalcoholicdrink >=1 && alcoholicdrink ==0 ) {
            discount = true;
        }
        else {discount = false;}
        return discount;

    }
}
