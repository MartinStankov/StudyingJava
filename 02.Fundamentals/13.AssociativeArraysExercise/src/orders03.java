import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class orders03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split(" ");

        Map<String, Double> prices = new LinkedHashMap<>();
        Map<String, Integer> quantities = new LinkedHashMap<>();

        while (!command[0].equals("buy")) {
            String product = command[0];
            double priceOfProduct = Double.parseDouble(command[1]);
            int amountOfProduct = Integer.parseInt(command[2]);

            prices.put(product, priceOfProduct);
            quantities.put(product, quantities.getOrDefault(product, 0) + amountOfProduct);


            command = scanner.nextLine().split(" ");

        }

        for (String product: prices.keySet()) {
            double total = prices.get(product) * quantities.get(product);
            System.out.printf("%s -> %.2f\n", product, total);
        }
    }
}
