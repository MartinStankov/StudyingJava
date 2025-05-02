import java.util.Scanner;

public class depositCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int depositSum = Integer.parseInt(scanner.nextLine());
        int depositPeriod = Integer.parseInt(scanner.nextLine());
        double yearInterestRate = Double.parseDouble(scanner.nextLine());

        double result = depositSum + depositPeriod * (((depositSum * yearInterestRate) / 12) / 100);
        System.out.println(result);
    }
}
