import java.util.Scanner;

public class treasureHunt10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] initialLoot = scanner.next().split("\\|");

        while (true){
            String command[] = scanner.nextLine().split(" ");

            if (command[0].equals("Yohoho!")){
                break;
            } else if (command[0].equals("Loot")){
                for (int i = 1; i < command.length; i++) {
                    String item = command[i];
                    boolean alreadyContained = false;

                    for (String loot : initialLoot) {
                        if (loot.equals(item)) {
                            alreadyContained = true;
                            break;
                        }
                    }

                    if (!alreadyContained) {
                        String[] newLoot = new String[initialLoot.length + 1];
                        newLoot[0] = item;
                        System.arraycopy(initialLoot, 0, newLoot, 1, initialLoot.length);
                        initialLoot = newLoot;
                    }
                }
            } else if (command[0].equals("Drop")){
                int index = Integer.parseInt(command[1]);

                if (index >= 0 && index < initialLoot.length) {
                    String itemToDrop = initialLoot[index];

                    String[] newLoot = new String[initialLoot.length];

                    int newIndex = 0;
                    for (int i = 0; i < initialLoot.length; i++) {
                        if (i != index) {
                            newLoot[newIndex++] = initialLoot[i];
                        }
                    }

                    newLoot[initialLoot.length - 1] = itemToDrop;
                    initialLoot = newLoot;
                }
            } else if (command[0].equals("Steal")){
                    int count = Integer.parseInt(command[1]);

                    int stolenCount = Math.min(count, initialLoot.length);
                    int newSize = initialLoot.length - stolenCount;

                    String[] stolenItems = new String[stolenCount];
                    String[] newLoot = new String[newSize];

                    System.arraycopy(initialLoot, 0, newLoot, 0, newSize);

                    for (int i = 0; i < stolenCount; i++) {
                        stolenItems[i] = initialLoot[newSize + i];
                    }

                    for (int i = 0; i < stolenCount; i++) {
                        System.out.print(stolenItems[i]);
                        if (i < stolenCount - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println();

                    initialLoot = newLoot;
            }
        }

        if (initialLoot.length > 0) {
            double sum = 0;
            for (String item : initialLoot) {
                sum += item.length();
            }

            double averageGain = sum / initialLoot.length;
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageGain);
        } else {
            System.out.println("Failed treasure hunt.");
        }

    }
}
