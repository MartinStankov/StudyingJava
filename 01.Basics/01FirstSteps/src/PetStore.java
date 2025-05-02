import java.util.Scanner;


public class PetStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dogFoodPrice = 2.5;
        int catFoodPrice = 4;

        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());

        double result = (dogFood * dogFoodPrice) + (catFood * catFoodPrice);

        System.out.printf("%.2f lv.", result);
    }

}
