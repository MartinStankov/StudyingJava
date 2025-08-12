import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class listOperations04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>(Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList());

        String command = scanner.nextLine();
        while (!command.equals("End")){
            String[] splitCommand = command.split(" ");
            String actualCommand = splitCommand[0];
            if (actualCommand.equals("Add")){
                numbers.add(Integer.parseInt(splitCommand[1]));
            }else if (actualCommand.equals("Insert")){
                int numberToInsert = Integer.parseInt(splitCommand[1]);
                int insertIndex = Integer.parseInt(splitCommand[2]);
                if (insertIndex < 0 || insertIndex > numbers.size()) {
                    System.out.println("Invalid index");
                } else {
                    numbers.add(insertIndex, numberToInsert);
                }
            }else if (actualCommand.equals("Remove")){
                int removeIndex = Integer.parseInt(splitCommand[1]);
                if (removeIndex < 0 || removeIndex >= numbers.size()) {
                    System.out.println("Invalid index");
                } else {
                    numbers.remove(removeIndex);
                }
            }else if (actualCommand.equals("Shift")){
                if (splitCommand[1].equals("left")){
                    for (int i = 0; i < Integer.parseInt(splitCommand[2]); i++){
                        int currentNum = numbers.get(0);
                        numbers.add(currentNum);
                        numbers.remove(0);
                    }
                } else if (splitCommand[1].equals("right")){
                    for (int i = 0; i < Integer.parseInt(splitCommand[2]); i++){
                        int lastNum = numbers.removeLast();
                        numbers.addFirst(lastNum);
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int element: numbers){
            System.out.printf("%d ", element);
        }
    }
}
