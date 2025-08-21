import java.util.Scanner;

public class repeatStrings02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputWords = scanner.nextLine().split(" ");

        String result = "";
        for (String word: inputWords) {

            for (int i = 0; i < word.length(); i++) {
                result += word;
            }
        }
        System.out.printf("%s", result);


//        StringBuilder result = new StringBuilder();
//        for (String word: inputWords) {
//
//            for (int i = 0; i < word.length(); i++) {
//                result.append(word);
//            }
//        }
//        System.out.printf("%s", result.toString());
    }
}
