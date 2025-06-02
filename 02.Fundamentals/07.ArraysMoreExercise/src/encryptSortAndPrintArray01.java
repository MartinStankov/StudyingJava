import java.util.Arrays;
import java.util.Scanner;

public class encryptSortAndPrintArray01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfIterations = Integer.parseInt(scanner.nextLine());
        int[] actualResult = new int[countOfIterations];

        for (int i = 0; i < countOfIterations; i++){
            String name = scanner.nextLine();
            int result = 0;

            for (int j = 0; j < name.length(); j++){
                char lowerChar = Character.toLowerCase(name.charAt(j));
                if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' ||
                        lowerChar == 'o' || lowerChar == 'u') {
                    result += (int) name.charAt(j) * name.length();
                } else {
                    result += (int) name.charAt(j) / name.length();
                }
            }
            actualResult[i] = result;
        }
        Arrays.sort(actualResult);
        for (int res: actualResult){
            System.out.println(res);
        }
    }
}
