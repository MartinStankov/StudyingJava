import java.util.Scanner;

public class foodDelivery {
    public static void main(String[] args) {
        double chickenMenuPrice = 10.35;
        double fishMenuPrice = 12.40;
        double veganMenuPrice = 8.15;
        double deliveryPrice = 2.50;

        Scanner scanner = new Scanner(System.in);
        int chickenMenusCount = Integer.parseInt(scanner.nextLine());
        int fishMenusCount = Integer.parseInt(scanner.nextLine());
        int veganMenusCount = Integer.parseInt(scanner.nextLine());

        double allMenusPrice = (chickenMenusCount * chickenMenuPrice) + (fishMenusCount * fishMenuPrice)
                + (veganMenusCount * veganMenuPrice);

        double dessertPrice = allMenusPrice * 0.2;

        System.out.printf("%.2f", allMenusPrice + dessertPrice + deliveryPrice);

    }
}
