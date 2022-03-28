package fh.campus02.hrhofer;

public class NarzistischeZahlen {
    public static void main(String[] args) {


        narzisstischeZahlBerechnen();

    }
    public static void narzisstischeZahlBerechnen() {
        for (int i = 1; i < 1000; i++) {
            if(i == (Math.pow(i % 10, 3)) + (Math.pow(i % 100 / 10, 3)) + (Math.pow(i / 100, 3))) {
                System.out.println(i);
            }
        }
    }
}
