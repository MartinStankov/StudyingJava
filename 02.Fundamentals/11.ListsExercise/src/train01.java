import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class train01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> trainList = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList());

        final int maxCapacityPerWagon = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("end")){
            String[] splitCommand = command.split(" ");
            if (splitCommand[0].equals("Add")) {
                trainList.add(Integer.parseInt(splitCommand[1]));
            } else {
                for (int i = 0; i < trainList.size(); i++){
                    if (trainList.get(i) + Integer.parseInt(splitCommand[0]) <= maxCapacityPerWagon) {
                        trainList.set(i, trainList.get(i) + Integer.parseInt(splitCommand[0]));
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }

        for (int element: trainList){
            System.out.printf("%d ", element);
        }
    }
}
