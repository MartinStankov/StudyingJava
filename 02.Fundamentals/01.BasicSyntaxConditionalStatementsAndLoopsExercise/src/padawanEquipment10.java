import java.util.Scanner;

public class padawanEquipment10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Because the lightsabers sometimes break, George Lucas should buy 10% more, rounded up to the next integer.
        // Also, every sixth belt is free.
        double currentMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double lightsabersPrice = ((Math.ceil((countOfStudents * 1.1)) * priceOfLightsabers));
        double robesPrice = countOfStudents * priceOfRobes;
        double beltsPrice = countOfStudents * priceOfBelts;
        int freeBeltsCount = 0;
        double totalPrice = lightsabersPrice + robesPrice + beltsPrice;

        for (int i = 1; i <= countOfStudents; i++) {
            if (i % 6 == 0){
                freeBeltsCount += 1;
            }
        }

        totalPrice -= (freeBeltsCount * priceOfBelts);
        if (currentMoney >= totalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - currentMoney);
        }
    }
}
