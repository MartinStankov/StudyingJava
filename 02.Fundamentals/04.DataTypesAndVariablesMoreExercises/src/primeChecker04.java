import java.util.Scanner;

public class primeChecker04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ___Do___ = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= ___Do___; i++) {
            boolean result = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    result = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, result);
        }
    }
}
