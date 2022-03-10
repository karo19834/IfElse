package fh.campus02.exercises1;

public class aray {
    public static void main(String[] args) {
        int [][] arrayInception = {{1,1,1}, {1,1,1},{1,1,1}};

        for (int i=0; i< arrayInception.length; i++) {
            for ( int j =0; j< arrayInception[i].length; j++ ){
                System.out.print( arrayInception [i][j] + " ");
            }
            System.out.println();
        }
        for ( int [] array : arrayInception) {
            for (int element : array ) {
                System.out.print( element +" ");
            }
            System.out.println();
        }
    }
}
