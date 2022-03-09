package fh.campus02.exercises2;

public class PingPong {
    public static void main(String[] args) {
        int number= 1;
        while ( number <=100) {
            if ( number % 6 == 0) {
                System.out.println( " ping ");
            }else if ( number % 3 == 0) {
                System.out.println(" pong ");
            }else if ( number % 2 == 0){
                System.out.println( " ping pong ");
            }else{
            System.out.println( " - ");}
            number++;
        }

        for (int i=1; i<=100; i++) {
            if ( i % 6 == 0) {
                System.out.println( " ping ");
            }else if ( i % 3 == 0) {
                System.out.println(" pong ");
            }else if ( i % 2 == 0){
                System.out.println( " ping pong ");
            }else{
                System.out.println( " - ");}
        }
    }
}
