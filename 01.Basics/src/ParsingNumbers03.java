import java.util.Scanner;

public class ParsingNumbers03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("We are gonna be dividing numbers now!");

        System.out.print("Please enter the first number: ");
        int FirstNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Please enter the second number: ");
        int SecondNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Do you want to subtract the first from the second number, or the second from the first?");
        System.out.println("Choose 1 for the first and 2 for the second:");

        int Choice = Integer.parseInt(scanner.nextLine());

        if(Choice == 1 ) {
            double Result = (double) FirstNumber / (double) SecondNumber;
            System.out.printf("The result from %d divided by %d is: %f", FirstNumber, SecondNumber, Result);
        } else if (Choice == 2) {
            double Result = (double) SecondNumber / (double) FirstNumber;
            System.out.printf("The result from %d divided by %d is: %f", SecondNumber, FirstNumber, Result);
        } else {
            System.out.println("You have entered an invalid choice. Please try again.");
        }
    }
}
