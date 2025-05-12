import java.util.Scanner;

public class waterOverflow07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short countOfIterations = Short.parseShort(scanner.nextLine());
        short maxCapacity = 255;
        short result = 0;

        for (int i = 0; i < countOfIterations; i++){
            short currentLiters = Short.parseShort(scanner.nextLine());
            if (result + currentLiters <= maxCapacity){
                result += currentLiters;
            } else {
                System.out.println("Insufficient capacity!");
                continue;
            }
        }
        System.out.println(result);
    }
}
