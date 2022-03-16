package fh.campus02.klassen;

public class Rechteck {
    double hoehe;
    double laenge;


    public double Flaeche(double hoehe, double laenge) {
        return hoehe*laenge;
    }
    public double  Umfang ( double hoehe, double laenge){
        return (2*hoehe)+(2*laenge);
    }
}
