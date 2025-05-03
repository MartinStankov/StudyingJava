import java.util.Scanner;

public class histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfIterations = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 0; i < numberOfIterations; i++) {
            int newNumber = Integer.parseInt(scanner.nextLine());

            if (newNumber < 200) {
                p1++;
            } else if (newNumber < 399) {
                p2++;
            } else if (newNumber < 599) {
                p3++;
            } else if (newNumber < 799) {
                p4++;
            } else {
                p5++;
            }
        }
        System.out.printf("%.2f%%\n", (p1 * 1.00) / numberOfIterations * 100);
        System.out.printf("%.2f%%\n", (p2 * 1.00) / numberOfIterations * 100);
        System.out.printf("%.2f%%\n", (p3 * 1.00) / numberOfIterations * 100);
        System.out.printf("%.2f%%\n", (p4 * 1.00) / numberOfIterations * 100);
        System.out.printf("%.2f%%\n", (p5 * 1.00) / numberOfIterations * 100);
    }
}
