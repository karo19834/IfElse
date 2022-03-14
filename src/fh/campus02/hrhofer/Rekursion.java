package fh.campus02.hrhofer;

public class Rekursion {
    public static void main(String[] args) {
        runterzaehlen(99, 0);

    }

    public static void runterzaehlen(int zahl, int stop) {
        System.out.println(zahl);
        if (zahl > 0 && zahl > stop) {
            runterzaehlen(zahl - 1, stop);
        }
    }
}
