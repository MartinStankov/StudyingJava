import java.util.Scanner;

public class snowballs11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int countOfIterations = Integer.parseInt(scanner.nextLine());

        long highestValue = 0;
        int bestSnow = 0;
        int bestTime = 0;
        int bestQuality = 0;

        for (int i = 0; i < countOfIterations; i ++){
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            long snowballValue = (long) Math.pow((double) snowballSnow / snowballTime, snowballQuality);

            if (snowballValue > highestValue){
                highestValue = snowballValue;
                bestSnow = snowballSnow;
                bestTime = snowballTime;
                bestQuality = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %d (%d)", bestSnow, bestTime, highestValue, bestQuality);
    }
}
