import java.util.*;

public class companyUser08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, LinkedHashSet<String>> companies = new LinkedHashMap<>();

        while (true) {
            String[] command = scanner.nextLine().split(" -> ");
            if (command[0].equals("End")) {
                break;
            }

            String company = command[0];
            String employeeId = command[1];

            if (!companies.containsKey(company)) {
                companies.put(company, new LinkedHashSet<>());
                companies.get(company).add(employeeId);
            } else {
                companies.get(company).add(employeeId);
            }
        }

        for (Map.Entry<String, LinkedHashSet<String>> company: companies.entrySet()) {
            System.out.printf("%s\n", company.getKey());
            for (String employeeId: company.getValue()) {
                System.out.printf("-- %s\n", employeeId);
            }
        }
    }
}
/*
Example input:
SoftUni -> AA12345
SoftUni -> CC12344
Lenovo -> XX23456
SoftUni -> AA12345
Movement -> DD11111
End
 */