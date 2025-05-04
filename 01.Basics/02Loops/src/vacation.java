import java.util.Scanner;

//TODO: Fix this task!

public class vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        int currentMoneyStart = Integer.parseInt(scanner.nextLine());
        int count_of_days = 0;
        int count_of_spending_days_only = 0;
        String lastDayActivity = "";

        while (true){
            String currentDayActivity = scanner.nextLine();
            int currentMoney = Integer.parseInt(scanner.nextLine());

            if (currentMoneyStart < 0){
                currentMoneyStart = 0;
            }

            if (currentDayActivity.equals("save")) {
                currentMoneyStart += currentMoney;
            }

            if (currentDayActivity.equals("spend")){
                lastDayActivity = "spend";
                count_of_spending_days_only += 1;
                currentMoneyStart -= currentMoney;
            } else{
                count_of_spending_days_only = 0;
            }

            if (count_of_spending_days_only >= 5){
                System.out.printf("You can't save the money.\n%d", count_of_spending_days_only);
                break;
            }
//            if (currentMoneyStart <= 0) {
//                System.out.printf("You can't save the money.\n%d", count_of_days);
//                break;
//            }

            count_of_days += 1;
            if (neededMoney <= currentMoneyStart){
                System.out.printf("You saved the money for %d days.", count_of_days);
                break;
            }

        }
    }
}
