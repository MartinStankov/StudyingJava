import java.util.Arrays;
import java.util.Scanner;

public class zigZagArrays03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int countOfIterations = Integer.parseInt(scanner.nextLine());

        int[] firstZigZag = new int[countOfIterations];
        int[] secondZigZag = new int[countOfIterations];
        int currentCount = 0;

        for (int i = 0; i < countOfIterations; i++){
            int[] currentArr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(e -> Integer.parseInt(e)).toArray();

            if (i % 2 == 0){
                firstZigZag[i] = currentArr[1];
                secondZigZag[i] = currentArr[0];
            } else {
                firstZigZag[i] = currentArr[0];
                secondZigZag[i] = currentArr[1];
            }
        }
        for (int element: secondZigZag){
            System.out.printf("%s ", element);
        }

        System.out.println();

        for (int element: firstZigZag){
            System.out.printf("%s ", element);
        }

    }
}
