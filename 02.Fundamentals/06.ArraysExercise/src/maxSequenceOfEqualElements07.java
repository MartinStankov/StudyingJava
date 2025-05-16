import java.util.Arrays;
import java.util.Scanner;

public class maxSequenceOfEqualElements07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] values = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int currentValue = -1;
        int finalValue = -1;
        int repeatCount = 0;
        int highestRepeatCount = 0;

        for (int i = 0; i < values.length; i++){
            if (currentValue != values[i]){
                currentValue = values[i];
                repeatCount = 1;
            }
            if (repeatCount > highestRepeatCount){
                finalValue = values[i];
                highestRepeatCount = repeatCount;
            }

            repeatCount += 1;
        }

        for (int i = 0; i < highestRepeatCount; i++){
            System.out.printf("%d ", finalValue);
        }
    }
}
