package fh.campus02.klassen;

public class GrundsteuerApp {
    public static void main(String[] args) {
        int [][] daten = {{1, 56, 2},
                          {3, 21, 15},
                          {2, 41, 14}};
        Grundsteuer steuer = new Grundsteuer();

        System.out.println( steuer.grundsteuerBerechnen(daten));
    }
}
