import java.util.Scanner;

public class floatingEquality03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());

        final double EPS = 0.000001;
        boolean areEqual = Math.abs(firstNum - secondNum) < EPS;

        System.out.println(areEqual ? "True" : "False");
    }
}
