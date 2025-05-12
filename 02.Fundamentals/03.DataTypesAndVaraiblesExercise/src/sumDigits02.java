import java.util.Scanner;

public class sumDigits02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int result = 0;

        while (number > 0){
            int digit = number % 10;
            result += digit;
            number /= 10;
        }

        System.out.println(result);
    }
}
