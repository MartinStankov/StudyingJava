import java.util.Scanner;

public class digitsLettersAndOther05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String digits = "";
        String letters = "";
        String others = "";

        String command = scanner.nextLine();

        for (int i = 0; i < command.length(); i++) {
            if (Character.isDigit((command.charAt(i)))) {
                digits += command.charAt(i);
            } else if (Character.isAlphabetic(command.charAt(i))) {
                letters += command.charAt(i);
            } else {
                others += command.charAt(i);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}
