package fh.campus02.udemy;

public class RecursionSum {
    public static void main(String[] args) {
        int num = 123456;
        int sum = getDigitSum(num);
        System.out.println( sum);

    }

    public static int getDigitSum(int number) {
        if (number == 0)
            return 0;
        return (number % 10 + getDigitSum(number / 10));
    }

}

