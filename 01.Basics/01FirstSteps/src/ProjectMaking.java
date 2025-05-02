import java.util.Scanner;

public class ProjectMaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int projectCount = Integer.parseInt(scanner.next());
        Integer hoursNeeded = projectCount * 3;

        System.out.printf("The architect %s will need %d" +
                " hours to complete %d projects.", name, hoursNeeded, projectCount);
    }

}
