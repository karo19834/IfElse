package fh.campus02.hrhofer;

public class ArrangeOrder {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 0, 6, 3, 1};
        arrangeOrder(numbers);
    }

    public static void arrangeOrder(int numbers[]) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int temp = 0;
            if (numbers[i] > numbers[i + 1]) {
                temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

