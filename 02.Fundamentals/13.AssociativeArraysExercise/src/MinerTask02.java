import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Integer> materials = new LinkedHashMap<String, Integer>();

        while (!command.equals("stop")) {
            int value = Integer.parseInt(scanner.nextLine());
            if (!materials.containsKey(command)) {
                materials.put(command, 0);
            }
            materials.put(command, materials.get(command) + value);

            command = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry: materials.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
