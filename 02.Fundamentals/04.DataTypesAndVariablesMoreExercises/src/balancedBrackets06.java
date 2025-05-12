import java.util.Scanner;

public class balancedBrackets06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int countOfIterations = Integer.parseInt(scanner.nextLine());
        boolean isBalanced = true;
        int openBrackets = 0;

        for (int i = 0; i < countOfIterations; i++) {
            String currentCharacters = scanner.nextLine();

            if (currentCharacters.equals("(")) {
                openBrackets += 1;
            } else if (currentCharacters.equals(")")) {
                if (openBrackets == 0) {
                    isBalanced = false;
                } else {
                    openBrackets -= 1;
                }
            }
        }

        if (openBrackets != 0){
            isBalanced = false;
        }
        System.out.println(isBalanced ? "BALANCED" : "UNBALANCED");
    }
}
