import java.util.Arrays;
import java.util.Scanner;

public class equalArrays06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] secondArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int sumOfArrays = 0;
        int firstIndexDifference = 0;
        boolean foundDifference = false;

        for (int i = 0; i < firstArray.length; i++) {
            if (foundDifference){
                break;
            }

            for (int j = i; j <= i; j++){
                if (firstArray[i] == secondArray[j]){
                    sumOfArrays += firstArray[i];
                }else {
                    foundDifference = true;
                    firstIndexDifference = i;
                    break;
                }
            }
        }

        if (foundDifference){
            System.out.printf("Arrays are not identical. Found difference at %d index.", firstIndexDifference);
        } else {
            System.out.printf("Arrays are identical. Sum: %d", sumOfArrays);
        }
    }
}
