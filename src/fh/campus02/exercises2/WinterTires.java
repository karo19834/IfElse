package fh.campus02.exercises2;

public class WinterTires {
    public static void main(String[] args) {
        int temperatur = 9;
        boolean slipperyRoad = false;

        if (needWinterTires(temperatur, slipperyRoad)) {
            System.out.println("Need winter tires. ");
        } else {
            System.out.println(("Don't need winter tires. "));
        }

    }

    public static boolean needWinterTires(int temperatur, boolean slipperyRoad) {
        if ((temperatur < 4) || (temperatur < 10 && slipperyRoad)) {
            return true;
        } else {
            return false;
        }
    }

}
