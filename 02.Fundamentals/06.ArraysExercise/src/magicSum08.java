import java.util.Arrays;
import java.util.Scanner;

public class magicSum08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] values = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int comparedValue = Integer.parseInt(scanner.nextLine());

        String result = "";

        for (int i = 0; i < values.length; i++){
            for (int j = i + 1; j < values.length; j++){
                if (values[i] + values[j] == comparedValue){
                    result += values[i] + " " + values[j] + "\n";
                }
            }
        }

        System.out.print(result);
    }
}
