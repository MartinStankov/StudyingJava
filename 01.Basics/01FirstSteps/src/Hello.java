import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");

        double randomNumber = 5.4;
        String name = scanner.next();
        System.out.printf("Your name is: %s\n", name);
        System.out.printf("The random number is: %.3f", randomNumber);
    }
}
