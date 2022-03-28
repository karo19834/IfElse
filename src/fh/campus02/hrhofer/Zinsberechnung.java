package fh.campus02.hrhofer;

public class Zinsberechnung {
    public static void main(String[] args) {
        double kontostand =6732;
        double zinsen = 2.25;
        System.out.println( erhalteneZinsen(kontostand,zinsen));
//        double erhalteneZinsen= (kontostand*zinsen)/100;
//        System.out.println( erhalteneZinsen);
    }
    public static double erhalteneZinsen ( double kontostand, double zinsen){
        double erhalteneZinsen = (kontostand*zinsen)/100;
        return erhalteneZinsen;
    }
}
