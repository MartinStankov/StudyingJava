import java.util.Arrays;
import java.util.Scanner;

public class evenAndOddSubtraction05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int evenResult = 0;
        int oddResult = 0;

        int[] values = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

//        for (int i = 0; i < values.length; i++){
//            if (values[i] % 2 == 0) {
//                evenResult += values[i];
//            } else{
//                oddResult += values[i];
//            }
//        }

        // Easy way to iterate through the values of the array
        for (int value : values) {
            if (value % 2 == 0){
                evenResult += value;
            } else {
                oddResult += value;
            }
        }
        System.out.print(evenResult - oddResult);
    }
}

