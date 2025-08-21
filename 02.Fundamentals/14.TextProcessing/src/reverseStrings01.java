import java.util.Scanner;

public class reverseStrings01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            }

            String word = "";

            for (int i = command.length() -1; i >= 0; i--) {
                word += command.charAt(i);
            }
            System.out.printf("%s = %s\n", command, word);
            word = "";

//            String reversed = new StringBuilder(command).reverse().toString();
//            System.out.printf("%s = %s\n", command, reversed);

//            StringBuilder word = new StringBuilder();
//
//            for (int i = command.length() -1; i >= 0; i--) {
//                word.append(command.charAt(i));
//            }
//            System.out.printf("%s = %s\n", command, word.toString());
//            word = new StringBuilder();
        }

    }
}
