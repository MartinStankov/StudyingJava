import java.util.Scanner;

public class CombiningTextAndDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        String lastName = scanner.next();
        Integer age = scanner.nextInt();
//        String age = scanner.next();
//        Integer age = Integer.parseInt(scanner.nextLine());
        String city = scanner.next();

//        Integer parsedAge = Integer.parseInt(age);
//        Integer result = parsedAge / 10;

        System.out.printf("You are %s %s, a %d-years old person from %s.\n", firstName, lastName, age, city);
//        System.out.printf("Result is: %d", result);
    }

}
