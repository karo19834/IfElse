package fh.campus02.klassen;

public class PunktApp {
    public static void main(String[] args) {
        Punkt a = new Punkt();
        Punkt b = new Punkt();
        Punkt c = a;

        System.out.println(a.x + " " + a.y);
        a.aenderePosition(1, 2);
        System.out.println(a.x + " " + a.y);
        // a unc sind gleich, beides referenzen und auf gleiche punkt objekt zeigen
        if (a == c) {
            System.out.println("a und c zeigen auf gleichen punktinstanz");
        }
        //System.out.println(b);
    }
}
