import java.util.Arrays;
import java.util.Scanner;

public class reverseArrayOfStrings04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] stuff = scanner.nextLine().split(" ");

        for (int i = stuff.length - 1; i >= 0; i--) {
            System.out.printf("%s ", stuff[i]);
        }
    }
}
