import java.util.Scanner;

public class Vacation03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double studentFriday = 8.45;
        double studentSaturday = 9.80;
        double studentSunday = 10.46;

        double businessFriday = 10.90;
        double businessSaturday = 15.60;
        double businessSunday = 16.00;

        double regularFriday = 15.00;
        double regularSaturday = 20.00;
        double regularSunday = 22.50;

        int groupCount = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double totalPrice = 0;

        if (typeOfGroup.equals("Students")){
            totalPrice = switch (day) {
                case "Friday" -> groupCount * studentFriday;
                case "Saturday" -> groupCount * studentSaturday;
                case "Sunday" -> groupCount * studentSunday;
                default -> totalPrice;
            };

            if (groupCount >= 30){
                totalPrice *= 0.85;
            }

            System.out.printf("Total price: %.2f", totalPrice);

        }else if (typeOfGroup.equals("Business")){

            if (groupCount >= 100){
                groupCount -= 10;
            }

            totalPrice = switch (day) {
                case "Friday" -> groupCount * businessFriday;
                case "Saturday" -> groupCount * businessSaturday;
                case "Sunday" -> groupCount * businessSunday;
                default -> totalPrice;
            };

            System.out.printf("Total price: %.2f", totalPrice);

        }else if (typeOfGroup.equals("Regular")){
            totalPrice = switch (day){
                case "Friday" -> groupCount * regularFriday;
                case "Saturday" -> groupCount * regularSaturday;
                case "Sunday" -> groupCount * regularSunday;
                default -> totalPrice;
            };

            if (groupCount >= 10 && groupCount <= 20){
                totalPrice *= 0.95;
            }

            System.out.printf("Total price: %.2f", totalPrice);

        }
    }
}
