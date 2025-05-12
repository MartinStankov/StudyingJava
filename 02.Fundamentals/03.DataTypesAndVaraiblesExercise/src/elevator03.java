import java.util.Scanner;

public class elevator03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        short numberOfPeople = Short.parseShort(scanner.nextLine());
        short capacity = Short.parseShort(scanner.nextLine());
        short compareVariable = 0;
        short result = 0;

        while (compareVariable < numberOfPeople) {
            compareVariable += capacity;
            result += 1;
        }

        System.out.println(result);
    }
}
