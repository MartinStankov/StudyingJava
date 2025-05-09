import java.util.Scanner;

public class StrongNumber06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;

//        int resultToCompare = 1;
//
//        for (int i = number; i > 0; i--){
//            resultToCompare *= i;
//        }
//
//        if (resultToCompare == number){
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }
        int sumFact = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            int fact = 1;
            for (int i = 1; i <= lastDigit; i++){
                fact = fact * i;
            }
            sumFact += fact;

            number = number / 10;
        }

        if (sumFact == startNumber){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }

    }
}
