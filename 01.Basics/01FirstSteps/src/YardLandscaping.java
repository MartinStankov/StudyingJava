import java.util.Scanner;


public class YardLandscaping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int squareMeters = Integer.parseInt(scanner.nextLine());
        double price = squareMeters * 7.61;
        double finalPrice = price * 0.82;

        System.out.printf("The final price is: %.2f lv.\nThe discount is: %.2f lv.", finalPrice, price - finalPrice);
    }
}
