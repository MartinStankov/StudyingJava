import java.util.Scanner;

public class townInfo04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String townName = scanner.nextLine();
        int countOfPopulation = Integer.parseInt(scanner.nextLine());
        short squareKilometers = Short.parseShort(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", townName,
                countOfPopulation, squareKilometers );
    }
}
