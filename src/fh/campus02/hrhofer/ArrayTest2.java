package fh.campus02.hrhofer;

public class ArrayTest2 {
    public static void main(String[] args) {
        String[] smartphoneNamen = {"Samsung A51 ", "iPhone 13 ", "Huawei ", "Nokia 3210 ", "Xiaomi 7T"};
        //eine zeile steht für ein smartphone
        //jede spalte in der zeile steht für verkaufszahlen in quartal
        int[][] smartphoneVerkaufsZahl = {{2000, 3000, 4000, 1000},
                                          {1000, 300, 1500, 7000},
                                          {2200, 300, 4000, 1000},
                                          {2100, 3000, 4000, 2000},
                                          {200, 300, 4000, 100}};


        for (int sNr = 0; sNr < smartphoneNamen.length; ++sNr)// keine gute Idee
        {
            System.out.println(smartphoneNamen[sNr]);
        }
////        // for each loop- schnellschreibvariante
////        //recht vom : steht das array ( oder sonstwas was mehrere daten beinhaltet)
////        for (String smartphone : smartphoneNamen) {
////            System.out.println(smartphone);
//   //     }
//        //alle s verkaufszahlen inkl namen ausgeben
        for (int sIndex = 0; sIndex < smartphoneVerkaufsZahl.length; ++sIndex) {
            System.out.print(smartphoneNamen[sIndex] + ": ");
            for (int qIndex = 0; qIndex < smartphoneVerkaufsZahl[sIndex].length; ++qIndex) {
                System.out.print(smartphoneVerkaufsZahl[sIndex][qIndex] + " ");
            }
//            // zeilenumbruch nach ausgabe alle quartalzahlen
            System.out.println();
            System.out.println(verkaufteAnzahlJahr(smartphoneVerkaufsZahl, 3));
        }
        String sName = erfolgreichsteSmartphoneQuartal(smartphoneVerkaufsZahl, smartphoneNamen, 42);
        System.out.println(sName);
        sName = erfolgreichsteSmartphoneQuartal(smartphoneVerkaufsZahl, smartphoneNamen, 1);
        System.out.println(sName);
    }

    // methode soll die verkaufenzahlen (jahr) smartphone zurückliefern
    // welche smartphon_index der angibt an welchen smartphone wir interessiert sind
    //zahlen: unsere verkaufszahlen
    //weitere anforderung: wenn ungültige wert auf welche smartfon angegeben wird, bitte -1 zurück
    public static int verkaufteAnzahlJahr(int[][] zahlen, int welchesSmartphone) {
        if (welchesSmartphone < 0 || welchesSmartphone >= zahlen.length) {
            return -1;
        }
        int summe = 0;
        for (int q = 0; q < zahlen[welchesSmartphone].length; ++q) {
            summe += zahlen[welchesSmartphone][q];
        }
        return summe;

    }

    //    Methode muss liefern smartphonename das in einem bestimmten quartal
//    am erforgreichten war
//     zahlen: unsere verkaufszahlen
//     namen: smartphonenamen
//     quartalnr: für welches quartal soll berechnet werden ( zwischen 1-4)- sonst rückgabe leere string
    public static String erfolgreichsteSmartphoneQuartal(int[][] zahlen, String[] namen, int quartalNr) {
        if (quartalNr < 1  || quartalNr > 4) {
            return " ";
        }
        //spalten bleiben immer gleic
        //   zahlen[][quartalNr-1]
        // nehmen wir an erste zahl ist grosste zahl
        int idxGr = 0;
        int zahlGr = zahlen[0][quartalNr -1];
        for (int z = 1; z < zahlen.length; ++z) {
            if(zahlen[z][quartalNr -1] > zahlGr){
                zahlGr = zahlen[z][quartalNr -1];
                idxGr =z;
            }
        }
        return  namen[idxGr];
    }
}
