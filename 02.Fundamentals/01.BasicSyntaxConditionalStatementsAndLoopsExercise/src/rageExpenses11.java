import java.util.Scanner;

public class rageExpenses11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double rageExpenses = 0;
        int keyboardTrashesCount = 0;

        for (int i = 1; i <= lostGamesCount; i++) {
            if (i % 2 == 0 && i % 3 == 0){
                rageExpenses += mousePrice + headsetPrice + keyboardPrice;
                keyboardTrashesCount += 1;
                if (keyboardTrashesCount % 2 == 0){
                    rageExpenses += displayPrice;
                    keyboardTrashesCount = 0;
                }
            } else if (i % 2 == 0){
                rageExpenses += headsetPrice;
            } else if (i % 3 == 0){
                rageExpenses += mousePrice;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", rageExpenses);
    }
}
