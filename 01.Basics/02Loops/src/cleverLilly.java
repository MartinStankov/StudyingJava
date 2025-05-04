import java.util.Scanner;

public class cleverLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());

        double moneyCollected = 0;
        int moneyIncrease = 0;
        int countOfToys = 0;

        for (int i = 1; i <= age; i++){
            if (i % 2 == 0){
                moneyIncrease += 1;
                moneyCollected += 10 * moneyIncrease;
            } else {
                countOfToys += 1;
            }

        }
        moneyCollected += countOfToys * pricePerToy;
        moneyCollected -= moneyIncrease;

        if (moneyCollected >= washingMachinePrice){
            System.out.printf("Yes! %.2f", moneyCollected - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", washingMachinePrice - moneyCollected);
        }
    }
}
