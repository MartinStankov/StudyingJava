import java.util.Scanner;

public class spiceMustFlow09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int result = 0;
        int countOfDays = 0;

        while (true){
            if (startingYield < 100) {
                if (result - 26 >= 0){
                    result -= 26;
                }
                System.out.println(countOfDays);
                System.out.println(result);
                break;
            }
            result += startingYield;
            if (result - 26 >= 0){
                result -= 26;
            }
            countOfDays += 1;
            startingYield -= 10;
        }
    }
}
