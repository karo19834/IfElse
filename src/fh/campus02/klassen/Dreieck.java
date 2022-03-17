package fh.campus02.klassen;

public class Dreieck {
    double laengeUnten;
    double laengeLinks;
    double laengeRecht;
    double hoeheD;

    public double FlaecheD(double laengeUnten, double hoeheD) {
        return 0.5 * laengeUnten * hoeheD;
    }

    public double Umfang(double laengeUnten, double laengeLinks, double laengeRecht) {
        return laengeUnten + laengeLinks + laengeRecht;
    }
}
