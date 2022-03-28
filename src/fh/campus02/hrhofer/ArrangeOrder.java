package fh.campus02.hrhofer;

public class ArrangeOrder {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 0, 6, 3, 1,9,4,7,8};
        arrangeOrder(numbers);
    }

    public static void arrangeOrder(int numbers[]) {
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}

