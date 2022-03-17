package fh.campus02.klassen;

public class Quader {
    int lang;
    int hoch;
    int breit;

    public int Volumen ( int lang, int hoch, int breit){
        return lang*hoch*breit;
    }
    public int Flaeche (int lang, int hoch, int breit ) { return (2* lang*hoch) + (2*hoch*breit)+(2*lang*breit);}

}
