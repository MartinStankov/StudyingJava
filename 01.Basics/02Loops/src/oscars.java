import java.util.Scanner;

public class oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int countOfRaters = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countOfRaters; i++){
            String rater = scanner.nextLine();
            double raterPoints = Double.parseDouble(scanner.nextLine());

            double finalPoints = (rater.length() * raterPoints) / 2;
            academyPoints += finalPoints;

            if (academyPoints > 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, academyPoints);
                break;
            }
        }
        if (academyPoints < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - academyPoints);
        }
    }
}
