package fh.campus02.klassen;

public class Haeschen {
    String name;
    String farbe;
    static String spezies= "Leporidae ";




    public  void hoppel ( String wohin) {
        System.out.println( name + " hoppelt "+ wohin);
    }
     //in statischen methoden können wir nur auf statische attribute zugreifen
    // java weiss bei nicht statischen attributen ja nicht von welchem objekt oder instatnz wir
    // es haben wollen bzw. ob es überhaupt einen gibt
    public static void ausgabeSpezies (){
        spezies = " Latainische Name: " + spezies;
        System.out.println(spezies);

    }
}
