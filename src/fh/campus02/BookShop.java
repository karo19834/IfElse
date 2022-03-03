package fh.campus02;

public class BookShop {
    public static void main(String[] args) {
        int nfbooks = 3;
        int fbooks = 3;
        boolean discount = booksdiscount( nfbooks, fbooks  );


        System.out.println( "I get discount: "+ discount);
    }
    public static boolean booksdiscount ( int nfbooks, int fbooks)
    {
        boolean discount;
        if (nfbooks > 2 && fbooks >=1) {
            discount = true;
        } else {
            discount = false;
        }
        return discount;
    }
}
