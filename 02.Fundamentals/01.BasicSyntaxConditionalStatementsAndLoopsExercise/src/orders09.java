import java.util.Scanner;

public class orders09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double finalPrice = 0;
        for (int i = 1; i <= number; i++){
            for (int j = i; j <= i; j++) {
                double price = Double.parseDouble(scanner.nextLine());
                int days = Integer.parseInt(scanner.nextLine());
                int capsulesCount = Integer.parseInt(scanner.nextLine());

                double totalPrice = price * days * capsulesCount;
                finalPrice += totalPrice;
                System.out.printf("The price for the coffee is: $%.2f\n", totalPrice);
            }
        }
        System.out.printf("Total: $%.2f", finalPrice);
    }
}
