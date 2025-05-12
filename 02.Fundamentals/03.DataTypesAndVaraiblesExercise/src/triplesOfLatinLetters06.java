import java.util.Scanner;

public class triplesOfLatinLetters06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int countOfIterations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countOfIterations; i++){
            char firstChar = (char) ('a' + i);
            for (int j = 0; j < countOfIterations; j++){
                char secondChar = (char) ('a' + j);
                for (int k = 0; k < countOfIterations; k++){
                    char thirdChar = (char) ('a' + k);
                    System.out.printf("%c%c%c\n", firstChar, secondChar, thirdChar);
                }
            }
        }

    }
}
