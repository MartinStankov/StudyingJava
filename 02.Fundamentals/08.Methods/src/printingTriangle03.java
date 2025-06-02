import java.util.Scanner;

public class printingTriangle03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(printFigure(number));
    }

    private static StringBuilder printFigure(int number){
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= i; j++){
                result.append(j).append(" ");
            }
            result.append('\n');
        }

        for (int i = number - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++){
                result.append(j).append(" ");
            }
            result.append('\n');
        }

        return result;
    }
}
