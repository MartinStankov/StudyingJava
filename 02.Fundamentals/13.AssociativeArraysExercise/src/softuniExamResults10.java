import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class softuniExamResults10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> students = new LinkedHashMap<>();
        Map<String, Integer> subjects = new LinkedHashMap<>();

        while (true) {
            String inputData = scanner.nextLine();
            if (inputData.equals("exam finished")) {
                break;
            }

            String[] parts = inputData.split("-");
            String name = parts[0];
            String subject = parts[1];
            if (subject.equals("banned")) {
                students.remove(name);
                continue;
            }

            int points = Integer.parseInt(parts[2]);
            if (!students.containsKey(name)) {
                students.put(name, points);
                subjects.put(subject, subjects.getOrDefault(subject, 0) + 1);
            } else {
                if (students.get(name) < points) {
                    students.put(name, points);
                    subjects.put(subject, subjects.getOrDefault(subject, 0) + 1);
                } else {
                    subjects.put(subject, subjects.getOrDefault(subject, 0) + 1);
                }
            }
//            System.out.println( students.get(name));
        }

        System.out.println("Results:");
        for (Map.Entry<String, Integer> student: students.entrySet()) {
            System.out.printf("%s | %d\n", student.getKey(), student.getValue());
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> submission: subjects.entrySet()) {
            System.out.printf("%s - %d\n", submission.getKey(), submission.getValue());
        }
    }
}
/*
Example inputs:
Input #1:
Peter-Java-84
George-C#-84
George-C#-70
Katy-C#-94
exam finished

Input #2:
Peter-Java-91
George-C#-84
Katy-Java-90
Katy-C#-50
Katy-banned
exam finished
 */