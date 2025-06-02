import java.util.Scanner;

public class grades02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        System.out.println(checkGrade(grade));
    }

    private static String checkGrade(double grade){
        if (grade >= 2.00 && grade <= 2.99){
            return "Fail";
        } else if (grade >= 3.00 && grade <= 3.49){
            return "Poor";
        } else if (grade >= 3.50 && grade <= 4.49){
            return "Good";
        } else if (grade >= 4.50 && grade <= 5.49){
            return "Very good";
        } else {
            return "Excellent";
        }
    }
}
