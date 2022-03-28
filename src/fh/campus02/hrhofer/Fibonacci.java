package fh.campus02.hrhofer;

public class Fibonacci {
    public static void main(String[] args) {
//        int ersteZahl =0;
//        int zweiteZahl=1;
//        int zahl=10;
//
//        for ( int i=0; i<zahl; i++ ){
//            System.out.println( ersteZahl +",");
//            int naechsteZahl= ersteZahl+zweiteZahl;
//            ersteZahl=zweiteZahl;
//            zweiteZahl=naechsteZahl;

//        }
        int zahl =10;
        for (int i=0; i< zahl; i++){
            System.out.println(fibonacci(i));
        }

    }

    public static int fibonacci(int f) {
        if ( f==0){
            return 0;
        }else if ( f==1){
            return 1;
        }else {
            return fibonacci(f-1)+ fibonacci(f-2);
        }
    }
}





