import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabsOpen = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        for (int i = 0; i < tabsOpen; i++){
            String siteName = scanner.nextLine();

            switch (siteName){
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }

        }

        if (salary <= 0){
            System.out.println("You have lost your salary.");
        } else if (salary > 0) {
            System.out.print((int) salary);
        }
    }
}
