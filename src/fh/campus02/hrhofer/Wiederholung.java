package fh.campus02.hrhofer;

public class Wiederholung {
    public static void main(String[] args) {
        int a=0,b=1;
        String s = "Hansi";
        int position = s.indexOf( "a");
        System.out.println(position);

        double d = 100.0;
        double d2 = 0.1;
        double d3 = 0.0000000000000001;

        System.out.println( d+d3);

        //unterschied post und pre inkrement
        a=1;
        int c;
        ++a; //wir erwarten 2
        System.out.println( a);
        c= ++a; //wir erwarten 3
        System.out.println( "a: "+a+"c: "+ c);






    }
}
