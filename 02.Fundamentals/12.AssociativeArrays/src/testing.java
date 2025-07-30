import java.util.*;

public class testing {
    public static void main(String[] args) {
        Map<String, Integer> testMap = new TreeMap<>();
        testMap.put("Ivan", 35958012);
        testMap.put("Ceco", 395950904);
        testMap.put("Misho", 395958059);
        testMap.put("Maria", 349305900);
        testMap.put("Aria", 349305900);

        Map<String, Integer> testMap1 = new TreeMap<>();
        testMap1.put("Ivan", 35958012);
        testMap1.put("Ceco", 395950904);
        testMap1.put("Misho", 395958059);
        testMap1.put("Maria", 349305900);
        testMap1.put("Aria", 349305900);
        System.out.println(testMap.equals(testMap1));

        for (Integer value: testMap.values() ){
            System.out.println("Value: " + value);
        }

        int minValue = Collections.max(testMap.values());

        System.out.println(minValue);

        double avg = Arrays.stream(new int[] {15, 25, 35}).average().getAsDouble();
        System.out.println(avg);
        for (String key: testMap.keySet()){
            System.out.println("Key: " + key);
        }
        testMap.forEach((key, value) -> System.out.printf("Key: %s, Value: %d; ", key, value));
    }
}
