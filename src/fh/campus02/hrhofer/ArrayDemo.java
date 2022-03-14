package fh.campus02.hrhofer;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] aray1 = {3, 4, 5};
        int[] aray2 = new int[3];
        aray2[0] = 7;
        aray2[1] = 1;
        aray2[2] = 3;

        int sum1 = aray1[0] + aray2[0];
        int sum2 = aray1[1] + aray2[1];
        int sum3 = aray1[2] + aray2[2];

        System.out.println(sum1 + " " + sum2 + " " + sum3);

        int mul1 = aray1[0] * aray2[0];
        int mul2 = aray1[1] * aray2[1];
        int mul3 = aray1[2] * aray2[2];

        System.out.println(mul1 + " " + mul2 + " " + mul3);
        System.out.print( "+: ");
        for (int z = 0; z < aray1.length; ++z) {
            System.out.print(aray1[z] + aray2[z]);
            System.out.print(",");
        }
        System.out.println(" ");
        System.out.print( "*: ");
        for (int z = 0; z < aray1.length; ++z) {
            System.out.print(aray1[z] * aray2[z]);
            System.out.print(",");


        }
    }
}
