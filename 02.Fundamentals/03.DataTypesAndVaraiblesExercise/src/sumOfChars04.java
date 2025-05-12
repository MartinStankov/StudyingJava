import java.util.Scanner;

public class sumOfChars04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        short countOfIterations = Short.parseShort(scanner.nextLine());
        short result = 0;

        for (int i = 0; i < countOfIterations; i ++){
            char letter = scanner.nextLine().charAt(0);
            result += (short) letter;
        }

        System.out.printf("The sum equals: %d", result);
    }
}
