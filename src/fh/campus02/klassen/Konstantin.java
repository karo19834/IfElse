package fh.campus02.klassen;

public class Konstantin {
    public static void main(String[] args) {
        //das sind beides konstant, mit final können wir nur max 1 mal wert zuweisen

        final int geburtsjahr = 1970;
        final int todesjahr;
        System.out.println(geburtsjahr);
        todesjahr = 2222;
        System.out.println(todesjahr);
        //todesjahr =2345; geht nicht
    }
}
