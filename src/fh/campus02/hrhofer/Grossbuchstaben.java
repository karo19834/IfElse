package fh.campus02.hrhofer;

public class Grossbuchstaben {
    public static void main(String[] args) {

        String satz = " Wie geht es dir?";
        String satz2 = " Alles gut";

        System.out.println( startMitGrossbuchstaben(satz));
        System.out.println( startMitGrossbuchstaben(satz2));


    }
    public static String startMitGrossbuchstaben ( String satz){
        String neuerSatz = "";
        for ( int i=0;i < satz.length(); i++){
            if ( satz.charAt(i) == ' '){
                neuerSatz = neuerSatz + " "+ Character.toUpperCase( satz.charAt(i+1));
                i++;
            }else {
                neuerSatz = neuerSatz + satz.charAt(i);
            }
        }return neuerSatz;
    }
}
