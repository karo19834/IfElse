package fh.campus02.exercises2;

public class ArraySum {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 4};
        System.out.println(" Sum of all numbers is " + calculateSum(numbers));

    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

}
