import java.util.Arrays;
import java.util.Scanner;

public class sumEvenNumbers03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        double totalSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                totalSum += numbers[i];
            }
        }

        System.out.printf("%.0f", totalSum);
    }
}
