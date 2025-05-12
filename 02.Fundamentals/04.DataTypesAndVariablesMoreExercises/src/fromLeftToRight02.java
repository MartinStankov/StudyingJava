import java.util.Scanner;

public class fromLeftToRight02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int countOfIterations = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countOfIterations; i++){

            String numbers = scanner.nextLine();
            String[] parts = numbers.split(" ");

            int leftNumber = Integer.parseInt(parts[0]);
            int rightNumber = Integer.parseInt(parts[1]);

            int longestNumber = Math.max(leftNumber, rightNumber);
            int sumOfAllNumbers = 0;
            for(i = 0; i <= longestNumber; i++){
                int currentNum = longestNumber % 10;
                sumOfAllNumbers += currentNum;

                longestNumber /= 10;
            }
            System.out.println(sumOfAllNumbers);
        }
    }
}
