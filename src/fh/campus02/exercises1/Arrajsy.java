package fh.campus02.exercises1;

import java.util.Arrays;

public class Arrajsy {
    public static void main(String[] args) {

        int [] array = new int [3];
        array [0] = 12;
        array [1] = 56;
        array [2] = 91;
        System.out.println(array); //zeig wo am Computer gespeichert ist
        System.out.println( Arrays.toString(array));


        int [] array2 = new int[] { 12, 13, 78};
        System.out.println( Arrays.toString(array2));

        array[2] =15;
        System.out.println( Arrays.toString(array));


    }
}
