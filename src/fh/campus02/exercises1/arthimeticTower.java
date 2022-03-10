package fh.campus02.exercises1;

public class arthimeticTower {
    public static void main(String[] args) {
        long number = 202103;
        makeTower(number);
    }
    public static void makeTower (long number){
        for (int i = 2; i < 10; i++) {
            System.out.println(number + "*" + i);
            number = number * i;
        }
        for (int j = 2; j < 10; j++) {
            System.out.println(number + "/" + j);
            number = number / j;
        }
    }
}
