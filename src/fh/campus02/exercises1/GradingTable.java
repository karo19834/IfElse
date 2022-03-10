package fh.campus02.exercises1;

public class GradingTable {
    public static void main(String[] args) {
        int points = 65;
        String grade = gradepoint(points);

        System.out.println("Your grade is: " + grade);

    }

    public static String gradepoint(int points) {
        String grade;
        if (points >= 90) {
            grade = "Outstanding";
        } else if (points >= 78 && points <= 89) {
            grade = "Excellent";
        } else if (points >= 65 && points <= 77) {
            grade = "Acceptable";
        } else if (points >= 51 && points <= 64) {
            grade = "Passing";
        } else {
            grade = "Fail";
        }
        return grade;
    }
}
