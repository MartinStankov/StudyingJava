import java.util.Scanner;

public class calculations04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        printResult(command, firstNum, secondNum);
    }

    private static void printResult(String command, int firstNum, int secondNum){
        if (command.equals("add")){
            System.out.printf("%d", (firstNum + secondNum));
        } else if (command.equals("multiply")){
            System.out.printf("%d", (firstNum * secondNum));
        } else if (command.equals("subtract")){
            System.out.printf("%d", firstNum - secondNum);
        } else if (command.equals("divide")){
            System.out.printf("%d", (firstNum / secondNum));
        }
    }
}
