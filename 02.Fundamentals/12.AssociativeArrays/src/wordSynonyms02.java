import java.util.*;

public class wordSynonyms02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte countOfIterations = Byte.parseByte(scanner.nextLine());

        Map<String, List<String>> synonyms = new LinkedHashMap<>();
        for (byte i = 0; i < countOfIterations; i++){
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!synonyms.containsKey(word)) {
                synonyms.put(word, new ArrayList<>());
                synonyms.get(word).add(synonym);
            } else {
                synonyms.get(word).add(synonym);
            }
        }

        for (Map.Entry<String, List<String>> entry: synonyms.entrySet()) {
            System.out.printf("%s - %s\n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
