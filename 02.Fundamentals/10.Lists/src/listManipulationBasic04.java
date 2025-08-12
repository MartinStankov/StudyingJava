import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class listManipulationBasic04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = new ArrayList<Integer>(Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList());

        String command = scanner.nextLine();
        while (!command.equals("end")){
            String[] splitCommand = command.split(" ");
            if (splitCommand[0].equals("Add")) {
                numbersList.add(Integer.parseInt(splitCommand[1]));
            } else if(splitCommand[0].equals("Remove")){
                numbersList.remove(Integer.valueOf(Integer.parseInt(splitCommand[1])));
            } else if(splitCommand[0].equals("RemoveAt")){
                numbersList.remove(Integer.parseInt(splitCommand[1]));
            } else if(splitCommand[0].equals("Insert")){
                numbersList.add(Integer.parseInt(splitCommand[2]), Integer.parseInt(splitCommand[1]));
            } else {
                break;
            }
            command = scanner.nextLine();
        }

        for (int element: numbersList){
            System.out.printf("%d ", element);
        }
    }
}
