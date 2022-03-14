package fh.campus02.hrhofer;

public class DebuggTest {
    public static void main(String[] args) {
        hansiSingt("1000 Träume ");
        int x = 5;
        System.out.println(x + "Punkte");
        hansiSingt("Nur du allein ");
        hansiSingt("Wann sehen wir uns wieder ");
        hansiSingtViel("Wo bist du ", 5);
    }

    public static void hansiSingt(String titel) {
        System.out.println("Hansi singt " + titel);
    }

    public static void hansiSingtViel(String titel, int wieoft) {

        for (int i = 0; i < wieoft; ++i) {
            System.out.println("Hansi singt " + titel);
        }
    }
}
