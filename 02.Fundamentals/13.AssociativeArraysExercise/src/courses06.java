import java.util.*;

public class courses06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<String>> courseMap = new LinkedHashMap<>();

        while(true) {
            String[] input = scanner.nextLine().split(" : ");
            if (input[0].equals("end")) {
                break;
            }
            String courseType = input[0];
            String courseStudent = input[1];

            if (!courseMap.containsKey(courseType)) {
                courseMap.put(courseType, new ArrayList<>());
                courseMap.get(courseType).add(courseStudent);
            } else {
                courseMap.get(courseType).add(courseStudent);
            }
        }


        for (Map.Entry<String, ArrayList<String>> entry: courseMap.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue().size());
            for (String name: entry.getValue()) {
                System.out.printf("-- %s\n", name);
            }
        }
    }
}
/*
Example input:
Programming Fundamentals : John Smith
Programming Fundamentals : Linda Johnson
JS Core : Will Wilson
Java Advanced : Harrison White
end
 */