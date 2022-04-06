package fh.campus02.klassen;

public class Grundsteuer {

    public double grundsteuerBerechnen ( int [][] gs){
        double grundsteuer =0;
        double [] preise = {3.2, 2.1 , 0.9};

        for(int i = 0; i < gs.length; ++i){
            grundsteuer += preise[gs[i][0] - 1] * gs[i][1] * gs[i][2];
        }
        return grundsteuer;
    }
//Lösung passt nicht
}
