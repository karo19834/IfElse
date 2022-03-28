package fh.campus02.hrhofer;

public class CalcFaculty {
    public static void main(String[] args) {
        System.out.println(calcfaculty(5));
        System.out.println(calcfaculty(3));

    }
    public static long calcfaculty ( int value){
        long sum=1;
        if (value==1){
            return 1;
        }
        for (int v=1; v<= value; v++){
            sum= sum*v;
        }
        return sum;
    }
}
