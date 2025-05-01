import java.util.Scanner;

public class MultiplyNumbers02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int FirstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int SecondNumber = scanner.nextInt();
        int Result = FirstNumber * SecondNumber;
//        System.out.printf("Multiplication result is: %d", Result);
        System.out.println("Multiplication result is: " + Result);
    }
}
