package fh.campus02.exercises1;

public class forLoop {
    public static void main(String[] args) {
        int sum =0;

        for ( int i=0; i < 10; i++) {
            // sum = sum +i
            sum += i;
        }
        System.out.println( sum);

        for (int index =50; index<=100; index++){
            // sum= sum+ index
            sum += index;
        }
        System.out.println(sum);

        String sentence = "Finally weekend!";

        for ( int j= 0; j<10 ; j++) {
            System.out.println(j+ " "+ sentence);
        }

    }
}
