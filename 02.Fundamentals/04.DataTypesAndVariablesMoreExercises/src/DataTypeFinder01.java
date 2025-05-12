import java.nio.file.LinkPermission;
import java.util.Scanner;

public class DataTypeFinder01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){

            String command = scanner.nextLine();
            String type = getType(command);
            if (command.equals("END")){
                break;
            }
            System.out.printf("%s is %s type\n", command, type);

        }
    }

    private static String getType(String input){
        try{
            Integer.parseInt(input);
            return "integer";
        } catch (NumberFormatException e){
            //Not an integer
        }
        try {
            Double.parseDouble(input);
            return "floating point";
        } catch (NumberFormatException e){

        }
        if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
            return "boolean";
        }

        if (input.length() == 1) {
            return "character";
        }

        return "string";
    }
}
