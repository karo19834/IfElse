package fh.campus02.klassen;

public class TamagochiApp {
    public static void main(String[] args) {
        Tamagochi karolek = new Tamagochi();
        karolek.x_koordinate=6;
        karolek.y_koordinate=4;
        karolek.futter =5;

        karolek.neuePosition("links", 6);
        karolek.fuettern(5);
        karolek.neuePosition("links",1);
        karolek.neuePosition("unten", 4);
        System.out.println(karolek.x_koordinate + " "+ karolek.y_koordinate);

    }
}
