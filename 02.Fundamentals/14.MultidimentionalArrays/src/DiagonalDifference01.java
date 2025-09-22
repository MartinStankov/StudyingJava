import java.util.Scanner;

public class DiagonalDifference01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {
            String[] rowData = scanner.nextLine().split(" ");
            for (int col = 0; col < size; col++) {
                matrix[row][col] = Integer.parseInt(rowData[col]);
            }
        }

        System.out.println(Math.abs(
                checkPrimaryDiagonal(matrix, size) -
                checkSecondaryDiagonal(matrix, size)
        ));

    }

//    public static int checkPrimaryDiagonal(int[][] matrix, int size) {
//        int result = 0;
//        for (int row = 0; row < size; row++) {
//            for (int col = row; col <= row; col++) {
//                result += matrix[row][col];
//            }
//        }
//        return result;
//    }

    public static int checkPrimaryDiagonal(int[][] matrix, int size) {
        int result = 0;
        for (int row = 0; row < size; row++) {
            result += matrix[row][row];
        }
        return result;
    }

    public static int checkSecondaryDiagonal(int[][] matrix, int size) {
        int result = 0;
        for (int row = 0; row < size; row++) {
            result += matrix[row][size -1 -row];
        }
        return result;
    }
}
