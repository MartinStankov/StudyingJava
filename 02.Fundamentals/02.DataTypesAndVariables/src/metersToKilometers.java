import java.util.Scanner;

public class metersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters = Integer.parseInt(scanner.nextLine());
        double kilometers = meters / 1000;
        System.out.printf("%.2f", kilometers);
    }
}
