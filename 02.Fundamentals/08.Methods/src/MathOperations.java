import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f", calculate(firstNumber, operator, secondNumber));
    }
    static double calculate(int firstNum, String operator, int secondNum){
        double result = 0.0;

        switch (operator){
            case "*":
                result = firstNum * secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "+":
                result = firstNum + secondNum;
                break;
            case "/":
                result = firstNum / secondNum;
                break;
        }

        return result;
    }
}
