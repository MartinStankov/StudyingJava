import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());

//        System.out.printf("%d", Power(firstNumber, secondNumber));
//        System.out.println(new DecimalFormat("0.####").format(Power(firstNumber, secondNumber)));

        double result = Power(firstNumber, secondNumber);

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }

    private static double Power(double firstNum, double secondNum){
        double result = 1;
        for (int i = 1; i <= secondNum; i++) {
            result = result * firstNum;
        }

        return result;
    }
}
