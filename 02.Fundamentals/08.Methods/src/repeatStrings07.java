import java.util.Scanner;

public class repeatStrings07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int timesToRepeat = Integer.parseInt(scanner.nextLine());

        System.out.printf("%s", repeatString(string, timesToRepeat));
    }

    private static String repeatString(String string, int times){
        String result = "";

        for (int i = 0; i < times; i++) {
            result += string;
        }

        return result;
    }
}
