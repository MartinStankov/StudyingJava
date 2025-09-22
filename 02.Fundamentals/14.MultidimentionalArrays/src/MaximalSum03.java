import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] rowData = scanner.nextLine().split(" ");

            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(rowData[col]);
            }
        }

        System.out.println(Arrays.deepToString(matrix));

        int maxSum = Integer.MIN_VALUE;
        int bestRow = 0;
        int bestCol = 0;

        for (int row = 0; row <= rows - 3; row++) {
            for (int col = 0; col <= cols - 3; col ++) {
                int currentSum = 0;
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        currentSum += matrix[i][j];
                    }
                }

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    bestRow = row;
                    bestCol = col;
                }
            }
        }

        System.out.println("Sum = " + maxSum);
        for (int i = bestRow; i < bestRow + 3; i++) {
            for (int j = bestCol; j < bestCol + 3; j++) {
                System.out.print(matrix[i][j]);
                if (j < bestCol + 2) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
