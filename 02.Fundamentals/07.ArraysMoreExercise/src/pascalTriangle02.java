import java.util.Scanner;

public class pascalTriangle02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        if (n <= 0){
            return;
        }

        int[] prevRow = {1};
        System.out.println(1);

        for (int i = 1; i < n; i++){
            int[] currentRow = new int[i + 1];
            currentRow[0] = 1;

            for (int j = 1; j < i; j++){
                currentRow[j] = prevRow[j - 1] + prevRow[j];
            }

            currentRow[i] = 1;

            for (int num: currentRow){
                System.out.print(num + " ");
            }
            System.out.println();

            prevRow = currentRow;
        }
    }
}
