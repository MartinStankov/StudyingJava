import java.util.Scanner;

public class pokeMon10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int firstNumClone = firstNum;
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int timesPoked = 0;

        while (firstNumClone >= secondNum){
            firstNumClone -= secondNum;
            timesPoked += 1;
            if (firstNumClone == firstNum / 2 && thirdNum != 0){
                firstNumClone /= thirdNum;
            }
        }
        System.out.println(firstNumClone);
        System.out.println(timesPoked);

    }
}
