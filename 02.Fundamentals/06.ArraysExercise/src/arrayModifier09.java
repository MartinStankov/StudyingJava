import java.util.Arrays;
import java.util.Scanner;

public class arrayModifier09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] values = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        while (true){
            String[] command = scanner.nextLine().split(" ");
            if (command[0].equals("end")) {
                break;
            }else if (command[0].equals("swap")) {
                int firstElement = Integer.parseInt(command[1]);
                int secondElement = Integer.parseInt(command[2]);
                int currentFirstElement = values[firstElement];
                values[firstElement] = values[secondElement];
                values[secondElement] = currentFirstElement;

            } else if (command[0].equals("multiply")) {
                int firstElement = Integer.parseInt(command[1]);
                int secondElement = Integer.parseInt(command[2]);
                values[firstElement] = values[firstElement] * values[secondElement];

            } else if (command[0].equals("decrease")){
                for (int i = 0; i < values.length; i++){
                    values[i] -= 1;
                }
            }
        }

        String valuesString = Arrays.toString(values);
        System.out.println(valuesString.substring(1, valuesString.length() - 1));

//        System.out.print(String.join(", ", valuesString));
//        for (int value: values){
//            System.out.printf("%d, ", value);
//        }
    }
}
