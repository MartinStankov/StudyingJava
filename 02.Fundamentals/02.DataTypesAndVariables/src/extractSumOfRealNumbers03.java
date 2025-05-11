import java.math.BigDecimal;
import java.util.Scanner;

public class extractSumOfRealNumbers03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfIterations = Integer.parseInt(scanner.nextLine());
        BigDecimal result = new BigDecimal(0);

        for (int i = 0; i < countOfIterations; i++) {
            BigDecimal number = new BigDecimal(scanner.nextLine());
            result = result.add(number);
        }

        System.out.println(result);
    }
}
