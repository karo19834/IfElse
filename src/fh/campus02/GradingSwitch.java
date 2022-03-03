package fh.campus02;

public class GradingSwitch {
    public static void main(String[] args) {
        System.out.println(getGradeText(1));
    }

    public static String getGradeText (int grade) {
        return switch (grade) {
            case 1 ->  "Outstanding";
            case 2 ->  "Excellent";
            case 3 ->  "Acceptable";
            case 4 ->  "Passing";
            case 5 ->  "Fail";
            default ->  null;


        };
    }
}
