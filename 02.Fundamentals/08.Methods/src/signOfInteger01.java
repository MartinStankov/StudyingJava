import javax.swing.*;
import java.util.Scanner;

public class signOfInteger01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        checkNumber(number);

    }
    private static void positiveNumberCheck(int number){
        if (number > 0){
            System.out.printf("The number %d is positive.", number);
        }
    }

    private static void negativeNumberCheck(int number){
        if (number < 0){
            System.out.printf("The number %d is negative.", number);
        }
    }

    private static void zeroNumberCheck(int number){
        if (number == 0){
            System.out.printf("The number %d is zero.", number);
        }
    }

    private static void checkNumber(int number){
        positiveNumberCheck(number);
        negativeNumberCheck(number);
        zeroNumberCheck(number);
    }
}
