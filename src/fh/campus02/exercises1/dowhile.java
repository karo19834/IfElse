package fh.campus02.exercises1;

public class dowhile {
    public static void main(String[] args) {
        countToAHundred( 1);
    }
    public static void countToAHundred (int from) {
        System.out.println(from);
        do {
            from++;
            System.out.println( from);
        }while ( from < 100);
    }

}
