import java.util.Scanner;

public class orders {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f", calculate(drink, amount));
    }

    private static double calculate(String drinkType, int amount){
        double totalPrice = 0;
        switch (drinkType){
            case "water":
                totalPrice += amount * 1.00;
                break;
            case "coke":
                totalPrice += amount * 1.40;
                break;
            case "coffee":
                totalPrice += amount * 1.50;
                break;
            case "snacks":
                totalPrice += amount * 2.00;
                break;
        }
        return totalPrice;
    }
}
