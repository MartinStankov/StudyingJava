import java.util.Scanner;

public class examPrep {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int affordableBadGrades = Integer.parseInt(scanner.nextLine());
        int countBadGrades = 0;
        double  averageGrade = 0;
        String lastProblem = "";
        int countOfProblems = 0;

        while (true){
            String subject = scanner.nextLine();
            if (subject.equals("Enough")) {
                break;
            }

            int grade = Integer.parseInt(scanner.nextLine());
            averageGrade += grade;

            if (grade <= 4){
                countBadGrades += 1;
            }

            if (countBadGrades == affordableBadGrades){
                System.out.printf("You need a break, %d poor grades.", affordableBadGrades);
                break;
            }

            lastProblem = subject;
            countOfProblems += 1;

        }
        if (countBadGrades < affordableBadGrades){
            System.out.printf("Average score: %.2f\nNumber of problems: %d\nLast problem: %s",
                    (averageGrade / countOfProblems), countOfProblems, lastProblem);
        }
    }
}
