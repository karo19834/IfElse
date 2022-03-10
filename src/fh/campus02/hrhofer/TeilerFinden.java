package fh.campus02.hrhofer;

public class TeilerFinden {
    public static void main(String[] args) {
        int z = 40;
        int t = 2;

        while (t < z) {
            if (z % t == 0) {
                System.out.println(t);
            }
            t++;
        }
    }
}
