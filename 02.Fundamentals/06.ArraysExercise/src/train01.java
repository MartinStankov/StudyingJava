import java.util.Arrays;
import java.util.Scanner;

public class train01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int countOfWagons = Integer.parseInt(scanner.nextLine());

        int[] passagers = new int[countOfWagons];

        for (int i = 0; i < countOfWagons; i++){
            int currentPassanger = Integer.parseInt(scanner.nextLine());
            passagers[i] = currentPassanger;
        }

        for (int passager : passagers) {
            System.out.printf("%s ", passager);
        }
        System.out.printf("\n%d", Arrays.stream(passagers).sum());
    }
}
