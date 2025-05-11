import java.util.Scanner;

public class lowerToUpper08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        char currentChar = scanner.nextLine().charAt(0);
        int asciiValue = (int) currentChar;

        if (asciiValue >= 65 && asciiValue <= 90){
            System.out.println("upper-case");
        } else if (asciiValue >= 97 && asciiValue <= 122){
            System.out.println("lower-case");
        }
    }
}
