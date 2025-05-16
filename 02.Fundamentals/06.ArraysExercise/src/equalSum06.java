import java.util.Arrays;
import java.util.Scanner;

public class equalSum06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] values = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean isFound = false;
        int currentIndex = 0;

        if (values.length == 1){
            System.out.print(0);
        }else {
            for (int i = 0; i < values.length; i++){
                int leftSum = 0;
                int rightSum = 0;

                for (int j = 0; j < i; j++){
                    leftSum += values[j];
                }
                for (int j = i + 1; j <= values.length -1; j++){
                    rightSum += values[j];
                }
                if (leftSum == rightSum){
                    currentIndex = i;
                    isFound = true;
                    break;
                }
            }
            if (isFound){
                System.out.print(currentIndex);
            } else{
                System.out.print("no");
            }
        }
    }
}
