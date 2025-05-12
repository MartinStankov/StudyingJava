import java.util.Scanner;

public class printPartOfAsciiTable05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short startNum = Short.parseShort(scanner.nextLine());
        short endNum = Short.parseShort(scanner.nextLine());

        String result = "";

        for (int i = startNum; i <= endNum; i++){
            result += " " + (char) i;
        }

        System.out.println(result);
    }
}
