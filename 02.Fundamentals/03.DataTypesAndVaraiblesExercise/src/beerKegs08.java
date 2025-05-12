import java.util.Scanner;

public class beerKegs08 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String result = "";
        short countOfIterations = Short.parseShort(scanner.nextLine());
        double compareVariable = 0;

        for (int i = 0; i < countOfIterations; i++){
            String model = scanner.nextLine();
            double radius = Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double res = calculateVolume(radius, height);
            if (res > compareVariable){
                compareVariable = res;
                result = model;
            }
        }

        System.out.println(result);
    }

    private static double calculateVolume(double radius, int height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
