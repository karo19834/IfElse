package fh.campus02.hrhofer;

public class RekBottlesBeer {
    public static void main(String[] args) {
        bottlesOfBeer( 99);

    }
    public static void bottlesOfBeer (int b) {
        if (b > 1 ) {
            System.out.println(b + " bottles of beer on the wall " + b + " bottles of beer.");
            System.out.println( "you take one down, pass it around. "+ (b-1)+ " bottles of beer on the wall.");
            bottlesOfBeer(b-1);
        }

    }
}
