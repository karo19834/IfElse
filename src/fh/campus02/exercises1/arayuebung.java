package fh.campus02.exercises1;

public class arayuebung {
    public static void main(String[] args) {
        int [][] multi = {{1,1,1}, {1,1,1},{1,1,1}};

        multi [1][1] =9;

        multi [0][0] = 3;
        multi [0][2] = 3;
        multi [2][0] = 3;
        multi [2][2] = 3;



        for ( int [] array : multi) {
            for (int element : array ) {
                System.out.print( element +" ");
            }
            System.out.println();
        }
    }
}
