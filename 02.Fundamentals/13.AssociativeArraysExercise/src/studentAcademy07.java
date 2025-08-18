import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class studentAcademy07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte countOfIterations = Byte.parseByte(scanner.nextLine());

        Map<String, ArrayList<Double>> studentGrades = new LinkedHashMap<>();
        for (byte i = 0; i < countOfIterations; i++) {
            String name = scanner.nextLine();
            Double grade = Double.parseDouble(scanner.nextLine());

            if (!studentGrades.containsKey(name)) {
                studentGrades.put(name, new ArrayList<>());
                studentGrades.get(name).add(grade);
            } else {
                studentGrades.get(name).add(grade);
            }
        }

        for (Map.Entry<String, ArrayList<Double>> student : studentGrades.entrySet()) {
            double averageGrade = studentGrades.get(student.getKey()).stream().
                    mapToDouble(Double::doubleValue).average().orElse(0.00);
            if (averageGrade >= 4.50) {
                System.out.printf("%s -> %.2f\n", student.getKey(), averageGrade);
            } else {
                continue;
            }
        }
    }
}

/*
Example input
5
Amanda
3.5
Amanda
4
Rob
5.5
Christian
5
Robert
6
*/