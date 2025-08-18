import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class forceBook09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<String>> forces = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Lumpawaroo")) {
                break;
            }

            if (input.contains(" | ")) {
                String[] parts = input.split(" \\| ");
                String forceCide = parts[0];
                String forceUser = parts[1];

                if (!forces.containsKey(forceCide)) {
                    forces.put(forceCide, new ArrayList<>());
                    forces.get(forceCide).add(forceUser);
                } else {
                    boolean isFound = false;
                    for (Map.Entry<String, ArrayList<String>> entry: forces.entrySet()) {
                        for (String user: entry.getValue()) {
                            if (user.equals(forceUser)) {
                                isFound = true;
                            }
                        }
                    }
                    if (isFound) {
                        continue;
                    }
                    forces.get(forceCide).add(forceUser);
                }

            } else if (input.contains(" -> ")) {
                String[] parts = input.split(" -> ");
                String forceUser = parts[0];
                String forceSide = parts[1];

                for (ArrayList<String> users: forces.values()) {
                    if (users.contains(forceUser)) {
                        users.remove(forceUser);
                    }
                }
                forces.putIfAbsent(forceSide, new ArrayList<>());
                forces.get(forceSide).add(forceUser);
                System.out.printf("%s joins the %s side!\n", forceUser, forceSide);
            }
        }
        for (Map.Entry<String, ArrayList<String>> entry: forces.entrySet()) {
            if (entry.getValue().size() > 0) {
                System.out.printf("Side: %s, Members: %d\n", entry.getKey(), entry.getValue().size());
                for (String name: entry.getValue()) {
                    System.out.printf("! %s\n", name);
                }
            }

        }
    }
}
/*
Example input:
Lighter | Royal
Darker | DCay
Ivan Ivanov -> Lighter
DCay -> Lighter
Lumpawaroo
 */