import java.util.Arrays;
import java.util.Scanner;

public class topIntegers05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] values = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean notBigger = false;

        for (int i = 0; i <= values.length - 1; i++) {
            for (int j = i + 1; j <= values.length - 1; j++){
                if (values[i] > values[j]){
                    continue;
                }else {
                    notBigger = true;
                    break;
                }
            }
            if (!notBigger){
                System.out.print(values[i] + " ");
            }
            notBigger = false;
        }
    }
}
