package fh.campus02.hrhofer;

public class UebungArayayaya {
    public static void main(String[] args) {
        int[] arr = {
                98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                12, 29, 2, 17, 8, 0};

        System.out.println("arr.length = " + arr.length);

        System.out.println("findSmallestNumber(arr) = " + findSmallestNumber(arr));
        System.out.println(" biggest number: " + findBiggestNumber(arr));
        System.out.println(" sum of all numbers: " + sumOfAllNumbers(arr));
    }

    public static int findSmallestNumber(int[] arr) {
        int small;
        small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (small > arr[i]) {
                small = arr[i];
            }
        }

        return small;
    }

    public static int findBiggestNumber(int[] arr) {
        int big;
        big = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (big < arr[i]) {
                big = arr[i];
            }
        }
        return big;
    }

    public static int sumOfAllNumbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
