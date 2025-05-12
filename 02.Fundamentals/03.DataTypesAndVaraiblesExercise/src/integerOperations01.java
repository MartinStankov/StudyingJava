import java.util.Scanner;

public class integerOperations01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        short firstNumber = Short.parseShort(scanner.nextLine());
        short secondNumber = Short.parseShort(scanner.nextLine());
        short thirdNumber = Short.parseShort(scanner.nextLine());
        short fourthNumber = Short.parseShort(scanner.nextLine());

        double result = 0;
        result += firstNumber + secondNumber;
        result /= thirdNumber;
        result *= fourthNumber;
        System.out.printf("%.0f", result);
    }
}
