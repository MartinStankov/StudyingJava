import java.util.Scanner;

public class PrintAndSum04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        int totalSum = 0;
        for (int i = startNumber; i <= endNumber; i++){
            totalSum += i;
            System.out.printf("%d ", i);
        }

        System.out.printf("\nSum: %d", totalSum);
    }
}
