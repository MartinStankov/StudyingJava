import java.util.Scanner;

public class dayOfWeek01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int dayOfTheWeek = Integer.parseInt(scanner.nextLine());
        String[] days = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (dayOfTheWeek > 7 || dayOfTheWeek < 1){
            System.out.println("Invalid day!");
        } else {
            System.out.println(days[dayOfTheWeek - 1]);
        }
    }
}
