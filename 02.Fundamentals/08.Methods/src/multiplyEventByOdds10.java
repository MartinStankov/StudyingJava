import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class multiplyEventByOdds10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.printf("%d", getMultipleOfEvensAndOdds(number));


//        String stringNumber = Integer.toString(number);
//        List<Integer> evenNumsList = new ArrayList<>();
//        List<Integer> oddNumsList = new ArrayList<>();
//
//        for (char digitChar : stringNumber.toCharArray()){
//            int digit = Character.getNumericValue(digitChar);
//            if (digit % 2 == 0){
//                evenNumsList.add(digit);
//            } else {
//                oddNumsList.add(digit);
//            }
//        }
//
//        for (int i = 0; i < evenNumsList.size(); i++){
//            System.out.println(evenNumsList.get(i));
//        }
    }
    private static int getMultipleOfEvensAndOdds(int number){
        int evensSum = getSumOfEvenDigits(number);
        int oddsSum = getSumOfOddDigits(number);

        return  evensSum * oddsSum;
    }

    private static int getSumOfEvenDigits(int number){
        int evensSum = 0;
        number = Math.abs(number);

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evensSum += digit;
            }
            number /= 10;
        }

        return evensSum;
    }

    static int getSumOfOddDigits (int number){
        int oddSum = 0;
        number = Math.abs(number);

        while (number > 0){
            int digit = number % 10;
            if (digit % 2 != 0) {
                oddSum += digit;
            }
            number /= 10;
        }

        return oddSum;
    }
}
