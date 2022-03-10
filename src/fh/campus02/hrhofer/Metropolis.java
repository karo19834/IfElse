package fh.campus02.hrhofer;

public class Metropolis {
    public static void main(String[] args) {
        System.out.println( isMetropolis(false, 400000, 340.0));

    }


    public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth) {
        if
        ( (isCapital  && inhabitants > 100000) ||((inhabitants*taxPerPersonAndMonth*12) >= 720000000 && inhabitants > 200000)) {
            return true;
        }else{
            return false;
        }

    }
}

