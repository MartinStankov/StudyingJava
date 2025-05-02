import java.util.Scanner;

public class aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double liters = ((length * width * height) * 0.001);
        double needed_liters = (liters * (1 - (percent / 100)));

        System.out.println(needed_liters);
    }
}
