import java.util.Scanner;

public class InchToCmConverter {
    public static void main(String[] args) {
        System.out.println("Which number do you want to convert to inches?");
        Scanner scanner = new Scanner(System.in);

        int givenNumber = Integer.parseInt(scanner.nextLine());
        double result = givenNumber * 2.54;
        System.out.printf("The number %d, converted to inches equals %.2f cm", givenNumber, result);
    }
}
