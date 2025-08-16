import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class legendaryFarming04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new LinkedHashMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0 );
        keyMaterials.put("motes", 0);

        Map<String, Integer> junk = new LinkedHashMap<>();
        String obtained = null;

        while (obtained == null) {
            String[] input = scanner.nextLine().toLowerCase().split(" ");

            for (int i = 0; i < input.length; i+= 2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1];

                if (keyMaterials.containsKey(material)) {
                    keyMaterials.put(material, keyMaterials.get(material) + quantity);
                    if (keyMaterials.get(material) >= 250 && obtained == null) {
                        obtained = material;
                        keyMaterials.put(material, keyMaterials.get(material) - 250);
                        break;
                    }
                } else {
                    junk.put(material, junk.getOrDefault(material, 0) + quantity);
                }
            }
        }

        String legendary = "";
        if (obtained.equals("shards")) legendary = "Shadowmourne";
        else if (obtained.equals("fragments")) legendary = "Valanyr";
        else if (obtained.equals("motes")) legendary = "Dragonwrath";

        System.out.println(legendary + " obtained!");
        keyMaterials.forEach((k, v) -> System.out.println(k + ": " + v));
        junk.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
