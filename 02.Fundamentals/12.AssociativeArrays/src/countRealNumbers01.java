import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class countRealNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> numberOccurances = new TreeMap<>();
        for (double number : numbers) {
            if (!numberOccurances.containsKey(number)) {
                numberOccurances.put(number, 1);
            } else {
                numberOccurances.put(number, numberOccurances.get(number) + 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : numberOccurances.entrySet()) {

            System.out.printf("%.0f -> %d\n", entry.getKey(), entry.getValue());
        }

//        for (double num : numbers) {
//            if (!numberOccurances.containsKey(num)) {
//                numberOccurances.put(num, 0);
//            }
//            numberOccurances.put(num, numberOccurances.get(num) + 1);
//        }
//
//        for (Map.Entry<Double, Integer> entry : numberOccurances.entrySet()) {
//            DecimalFormat df = new DecimalFormat("#.#######");
//            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
//        }
    }
}
