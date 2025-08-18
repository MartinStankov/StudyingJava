import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class softuniParking05 {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);

        byte iterations = Byte.parseByte(scanner.nextLine());

        Map<String, String> parking = new LinkedHashMap<>();

        for (byte i = 0; i < iterations; i++) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            String name = input[1];

            if (command.equals("register")) {
                if (parking.containsKey(name)) {
                    String plateNumber = input[2];
                    System.out.printf("ERROR: already registered with plate number %s\n", plateNumber);
                    continue;
                } else {
                    String plateNumber = input[2];
                    System.out.printf("%s registered %s successfully\n", name, plateNumber);
                    parking.put(name, plateNumber);
                }
            } else if (command.equals("unregister")) {
                if (!parking.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found\n", name);
                } else {
                    System.out.printf("%s unregistered successfully\n", name);
                    parking.remove(name);
                }
            }
        }

        for (Map.Entry<String, String> entry: parking.entrySet()) {
            System.out.printf("%s => %s\n", entry.getKey(), entry.getValue());
        }
    }
}
/*
Example input:
5
register John CS1234JS
register George JAVA123S
register Andy AB4142CD
register Jesica VR1223EE
unregister Andy
 */