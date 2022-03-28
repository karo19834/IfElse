package fh.campus02.klassen;

public class Mitarbeiter {

    String vornameMitarbeiter;
    String nachnameMitarbeiter;
    double monatsGehalt;
    int alter;

    public double monatsAbrechnung() {
        double monatsGehaltAbrechnung;

        monatsGehaltAbrechnung = (monatsGehalt * 12) * 0.8;

//        if (monatsGehaltAbrechnung <= 10000) {
//            monatsGehaltAbrechnung * 0.9;
//        } else if (monatsGehaltAbrechnung > 10000 && monatsGehaltAbrechnung <= 20000) {
//            monatsGehaltAbrechnung * 0.8;
//        } else if (monatsGehaltAbrechnung > 20000 && monatsGehaltAbrechnung <= 30000) {
//            monatsGehaltAbrechnung * 0.68;
//        } else if (monatsGehaltAbrechnung > 30000 && monatsGehaltAbrechnung <= 50000) {
//            monatsGehaltAbrechnung * 0.55;
//        } else if (monatsGehaltAbrechnung > 50000) {
//            monatsGehaltAbrechnung * 0.4;
//        }
        return monatsGehaltAbrechnung / 12;


    }

    public double jahresAbrechnung() {
        double jaresEinkommen;

        jaresEinkommen = monatsGehalt * 12;

        return jaresEinkommen;

    }


}
