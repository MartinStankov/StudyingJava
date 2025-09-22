import java.util.Arrays;
import java.util.Scanner;

public class SquaresInMatrixes02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimensions = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);


        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] rowData = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rowData[j];
            }
        }

        System.out.println(Arrays.deepToString(matrix));
        int result = 0;

        for (int row = 0; row < rows; row++) {

            for (int col = 0; col < cols; col++) {
                if(row < rows - 1 && col < cols - 1) {
                    if (matrix[row][col].equals(matrix[row + 1][col + 1]) &&
                            matrix[row][col].equals(matrix[row][col + 1]) &&
                            matrix[row][col].equals(matrix[row + 1][col])
                    ) {
                        result += 1;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
