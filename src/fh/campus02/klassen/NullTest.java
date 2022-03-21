package fh.campus02.klassen;

import java.util.Locale;

public class NullTest {
    public static void main(String[] args) {
        String hansisLieblingsPizza = null;// zeigt nirgendwohin-es ist nichts da

        //hansisLieblingsPizza.indexOf( "a");


        //sobald wir ein objekt zuweisen geht ganz normal

        hansisLieblingsPizza = "Margherita ( mit 1-2 kleinen Ananas unter dem Käse versteckt)";

        System.out.println( hansisLieblingsPizza);
        System.out.println(hansisLieblingsPizza.toUpperCase());


    }
}
