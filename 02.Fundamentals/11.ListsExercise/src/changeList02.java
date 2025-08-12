import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class changeList02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = new ArrayList<Integer>(Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList());

        List<Integer> numbersListCopy = new ArrayList<>(numbersList);

        String command = scanner.nextLine();
        while (!command.equals("end")){
            String[] splitCommand = command.split(" ");
            if (splitCommand[0].equals("Delete")){
                for (int element: numbersListCopy){
                    if (element == Integer.parseInt(splitCommand[1])){
                        numbersList.remove(Integer.valueOf(Integer.parseInt(splitCommand[1])));
                    }
                }
            } else if (splitCommand[0].equals("Insert")){
                numbersList.add(Integer.parseInt(splitCommand[2]), Integer.parseInt(splitCommand[1]));
            }

            command = scanner.nextLine();
        }

        for (int element: numbersList){
            System.out.printf("%d ", element);
        }
    }
}
