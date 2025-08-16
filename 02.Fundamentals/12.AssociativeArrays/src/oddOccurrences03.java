import java.util.*;

public class oddOccurrences03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        List<String> oddWords = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            if (!counts.containsKey(words[i].toLowerCase())) {
                counts.put(words[i].toLowerCase(), 0);
            }
            counts.put(words[i].toLowerCase(), counts.get(words[i].toLowerCase()) + 1);
        }

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddWords.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", oddWords));
    }
}
