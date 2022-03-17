package fh.campus02.hrhofer;

public class ArrangeOffer {
    public static void main(String[] args) {
      int [] numbers = { 5,2,0,6,3,1};

    }
    public static void arrangeOrder ( int numbers []){
        for (int i=0 ; i < numbers.length; i++) {
            if (numbers[i] > numbers[i+1]){
                numbers[i]=numbers[i+1];
            }
        }
    }
}
