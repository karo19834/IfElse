package fh.campus02.exercises2;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] before = new int[] {1,2,3,4,5};
        System.out.println( " Original order: "+ Arrays.toString(before));
        int[] after = reverse(before);
        System.out.println( " New order: " + Arrays.toString(after));

    }

    public static int[] reverse (int[]before) {
        int[] newOrder = new int[before.length];
        for (int i= before.length - 1; i>=0; i--) {
            newOrder [before.length -1 -i] = before[i];
        }
        return newOrder;
    }
}
