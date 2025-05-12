import java.util.Scanner;

public class decryptingMessage05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int countOfIterations = Integer.parseInt(scanner.nextLine());
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < countOfIterations; i++) {
            char currentChar = scanner.nextLine().charAt(0);
            int asciiValue = (int) currentChar + key;
            result.append((char) asciiValue);
        }

        System.out.println(result);
    }
}
