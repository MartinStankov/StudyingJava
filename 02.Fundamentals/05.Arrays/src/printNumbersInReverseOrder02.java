import java.util.Scanner;

public class printNumbersInReverseOrder02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int countOfIterations = Integer.parseInt(scanner.nextLine());

        String[] values = new String[countOfIterations];

        for (int i = 0; i < countOfIterations; i++){
            String currentValue = scanner.nextLine();
            values[i] = currentValue;
        }

        for (int i = values.length - 1; i >= 0; i--){
            System.out.printf("%s ", values[i]);
        }
    }
}
