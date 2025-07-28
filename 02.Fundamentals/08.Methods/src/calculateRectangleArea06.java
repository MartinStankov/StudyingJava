import java.util.Scanner;

public class calculateRectangleArea06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f", calculateArea(width, height));
    }
    private static double calculateArea(int width, int height){
        return width * height;
    }
}
