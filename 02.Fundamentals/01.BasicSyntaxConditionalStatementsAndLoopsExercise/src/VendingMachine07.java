import java.util.Scanner;

public class VendingMachine07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalMoney = 0;

        String input = scanner.nextLine();
        while (!input.equals("Start")) {
            double coin = Double.parseDouble(input);

            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2){
                totalMoney += coin;
            } else{
                System.out.printf("Cannot accept %.2f", coin);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("End")){
            double price = 0;
            boolean validProduct = true;

            switch (input) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    validProduct = false;
                    System.out.println("Invalid product");
                    break;
            }

            if (validProduct) {
                if (totalMoney >= price){
                    System.out.printf("Purchased %s\n", input);
                    totalMoney -= price;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }
            input = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", totalMoney);
    }
}
