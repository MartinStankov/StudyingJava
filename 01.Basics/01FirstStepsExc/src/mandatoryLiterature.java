import java.util.Scanner;

public class mandatoryLiterature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesCount = Integer.parseInt(scanner.nextLine());
        int pages = Integer.parseInt(scanner.nextLine());
        int daysCount = Integer.parseInt(scanner.nextLine());

        int timeForCompletion = pagesCount / pages;
        int neededTimePerDay = timeForCompletion / daysCount;

        System.out.println(neededTimePerDay);

    }
}
