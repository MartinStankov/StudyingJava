import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class houseParty03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfIterations = Integer.parseInt(scanner.nextLine());

        List<String> participants = new ArrayList<String>();


        for (int i = 0; i < countOfIterations; i++) {
            String command = scanner.nextLine();
            String[] splitCommand = command.split(" ");
            String name= splitCommand[0];

            if (splitCommand[2].equals("going!")) {
                if(participants.contains(name)){
                    System.out.printf("%s is already in the list!\n", name);
                } else {
                    participants.add(name);
                }
            } else {
                if(participants.contains(name)){
                    participants.remove(name);
                } else {
                    System.out.printf("%s is not in the list!\n", name);
                }
            }
        }

        for (String element : participants) {
            System.out.printf("%s\n", element);
        }
    }
}
