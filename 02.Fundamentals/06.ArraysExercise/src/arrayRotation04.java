import java.util.Arrays;
import java.util.Scanner;

public class arrayRotation04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] values = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int numberOfRotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfRotations; i++){
            int firstValue = values[0];

            for (int j = 0; j < values.length - 1; j++){
                values[j] = values[j + 1];
            }
            values[values.length - 1] = firstValue;
//            values[values.length - (i + 1)] = firstValue;
//            int firstValueCopy = firstValue;
//            int lastValue = values.length - 1;
//
//            firstValue = lastValue;
//            lastValue = firstValueCopy;

        }

        for (int value : values){
            System.out.printf("%d ", value);
        }
    }
}
