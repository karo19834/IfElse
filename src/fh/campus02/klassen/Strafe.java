package fh.campus02.klassen;

public class Strafe {
    String vorname;
    String nachname;
    String kennzeichen;
    int strafnummer;
    double strafe;
    int anzahlStrafen;

    public void  strafe ( int geschwindigkeitsueberschreitung) {
        if (geschwindigkeitsueberschreitung >=0 && geschwindigkeitsueberschreitung <=20) {
            strafe= strafe + 30;
            System.out.println( " Du kriegst "+ strafe + " € Strafe. ");
        }else if (geschwindigkeitsueberschreitung > 20 && geschwindigkeitsueberschreitung <=30){
            strafe= strafe + 50;
            System.out.println( " Du kriegst "+ strafe + " € Strafe. ");
        }else if (geschwindigkeitsueberschreitung > 30 && geschwindigkeitsueberschreitung <=50) {
            strafe = strafe + 100;
            System.out.println(" Du kriegst " + strafe + " € Strafe. ");
        }else if (geschwindigkeitsueberschreitung > 50 && geschwindigkeitsueberschreitung <=100) {
            strafe = strafe + 500;
            System.out.println(" Du kriegst " + strafe + " € Strafe. ");
        }else if (geschwindigkeitsueberschreitung > 100) {
            strafe = strafe + 1500;
            System.out.println(" Du kriegst " + strafe + " € Strafe. ");
        }else {
            System.out.println( " Falsche Eigabe. ");
        }
    }

}
