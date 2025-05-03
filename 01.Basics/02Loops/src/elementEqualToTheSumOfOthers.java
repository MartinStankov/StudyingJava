import java.util.Scanner;

public class elementEqualToTheSumOfOthers {
    public static void main(String[] args) {
        int maxNum = -1000000;
        Scanner scanner = new Scanner(System.in);
        int iterationCount = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;

        for (int i = 0; i < iterationCount; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number > maxNum) {
                maxNum = number;
            }
            totalSum += number;
        }

        if (totalSum - maxNum == maxNum) {
            System.out.printf("The sum is: %d", maxNum);
        } else {
            System.out.printf("The difference between the numers is: %d", totalSum - maxNum);
        }
    }
}
