import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dollars = Double.parseDouble(scanner.nextLine());
        double bgn = dollars * 1.7954;
        System.out.printf("%.2f", bgn);
    }
}
