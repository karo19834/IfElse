package fh.campus02;

public class Busticket {

    public static void main(String[] args) {
	boolean isDog = false;
	boolean isSenior= true;
	boolean isStudent = false;
	double ticketPrice = 2.5;
	double discount= getBusDiscount(ticketPrice, isDog, isSenior, isStudent);



        System.out.println("I get a discount: " + discount+ "€");
    }
    public static double getBusDiscount ( double ticketPrice, boolean isDog, boolean isSenior, boolean isStudent){
        double discount;
        if (isDog){
            discount = ticketPrice *0.2;
        }else if (isSenior){
            discount= ticketPrice *0.15;
        }else if (isStudent){
            discount= ticketPrice * 0.1;
        }else {
            discount =0;
        }
        return discount;

    }
}
