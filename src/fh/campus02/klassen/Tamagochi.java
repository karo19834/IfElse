package fh.campus02.klassen;

public class Tamagochi {
    int x_koordinate;
    int y_koordinate;
    int futter;

    public void neuePosition(String richtung, int anzahlSchritten) {
        while ( futter>0 && anzahlSchritten>0){
            if( richtung.equals("oben")){
                ++y_koordinate;
            }else if ( richtung.equals( "unten")){
                --y_koordinate;
            }else if ( richtung.equals("links")){
                --x_koordinate;
            }else if ( richtung.equals("recht")){
                ++x_koordinate;
            }
            --anzahlSchritten;
            --futter;
        }
    }

    public void fuettern(int anzahlFutter) {
        futter= futter+ anzahlFutter;
    }

}
