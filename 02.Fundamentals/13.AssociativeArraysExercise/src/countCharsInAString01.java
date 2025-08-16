import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countCharsInAString01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Map<String, Integer> count = new LinkedHashMap<>();
        for (String word: words) {
            for (int i = 0; i < word.length(); i++) {
                String ch = String.valueOf(word.charAt(i));
                if (!count.containsKey(ch)) {
                    count.put(ch, 0);
                }
                count.put(ch, count.get(ch) + 1);
            }
        }

        for (Map.Entry<String, Integer> countOfChars: count.entrySet()) {
            System.out.printf("%s -> %d\n", countOfChars.getKey(), countOfChars.getValue());
        }
    }
}
