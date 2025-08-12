import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class listManipulationAdvanced05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = new ArrayList<Integer>(Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] splitCommand = command.split(" ");
            if (splitCommand[0].equals("Contains")) {
                boolean isFound = false;
                for (int element : numbersList) {
                    if (element == Integer.parseInt(splitCommand[1])) {
                        System.out.println("Yes");
                        isFound = true;
                        break;
                    }
                }
                if (!isFound) {
                    System.out.println("No such number");
                }

            } else if (splitCommand[0].equals("Print")) {
                if (splitCommand[1].equals("odd")) {
                    for (int element : numbersList) {
                        if (element % 2 != 0) {
                            System.out.printf("%d ", element);
                        }
                    }
                    System.out.println();
                } else if (splitCommand[1].equals("even")) {
                    for (int element : numbersList) {
                        if (element % 2 == 0) {
                            System.out.printf("%d ", element);
                        }
                    }
                    System.out.println();
                }
            } else if (splitCommand[0].equals("Get")) {
                int result = 0;
                for (int element : numbersList) {
                    result += element;
                }
                System.out.println(result);
            } else if (splitCommand[0].equals("Filter")) {
                switch (splitCommand[1]) {
                    case "<":
                        for (int element : numbersList) {
                            if (element < Integer.parseInt(splitCommand[2])) {
                                System.out.printf("%d ", element);
                            }
                        }
                        System.out.println();
                        break;
                    case "<=":
                        for (int element : numbersList) {
                            if (element <= Integer.parseInt(splitCommand[2])) {
                                System.out.printf("%d ", element);
                            }
                        }
                        System.out.println();
                        break;
                    case ">":
                        for (int element : numbersList) {
                            if (element > Integer.parseInt(splitCommand[2])) {
                                System.out.printf("%d ", element);
                            }
                        }
                        System.out.println();
                        break;
                    case ">=":
                        for (int element : numbersList) {
                            if (element >= Integer.parseInt(splitCommand[2])) {
                                System.out.printf("%d ", element);
                            }
                        }
                        System.out.println();
                        break;
                }
            }
            command = scanner.nextLine();
        }
    }
}
