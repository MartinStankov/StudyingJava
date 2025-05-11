import java.util.Scanner;

public class refactorSpecialNumbers12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int total = 0;
        int currentNumber = 0;

        for (int i = 1; i <= number; i++) {
            currentNumber = i;
            while (i > 0) {
                total += i % 10;
                i = i / 10;
            }
            String isSpecial = (total == 5) || (total == 7) || (total == 11) ? "True" : "False";
            System.out.printf("%d -> %s%n", currentNumber, isSpecial);
            total = 0;
            i = currentNumber;
        }
    }
}
