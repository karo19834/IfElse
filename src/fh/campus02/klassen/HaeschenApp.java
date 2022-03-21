package fh.campus02.klassen;

public class HaeschenApp {
    public static void main(String[] args) {
        // statisches atribut/methode kann auch ohne objekt verwendet werden
        //mit der namen der klasse
        System.out.println(Haeschen.spezies );
        Haeschen rogger = new Haeschen();
        rogger.name = "Rogger Rabbit";
        rogger.farbe = " Weiß ";
        System.out.println( rogger.name + " "+ rogger.farbe);

        Haeschen bugs = null;
        // irgendwann später
        bugs = new Haeschen();
        bugs.name = " Bugsbunny ";
        bugs.farbe = " Grau ";



        //wir testen unsere hoppel methode, ohne haeschen geht nicht

        //Haeschen. ... geht nicht

        bugs.hoppel( " nach Hinten");
        rogger.hoppel( " in the woods ");

        //aufruf statische methode
        Haeschen.ausgabeSpezies();


    }

}
