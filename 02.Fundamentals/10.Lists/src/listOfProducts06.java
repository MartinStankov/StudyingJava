import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class listOfProducts06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> products = new ArrayList<String>();
        int countOfIterations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countOfIterations; i++){
            products.add(scanner.nextLine());
        }

        Collections.sort(products);
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d.%s\n", i + 1, products.get(i));
        }

    }
}
