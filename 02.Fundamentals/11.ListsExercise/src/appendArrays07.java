import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class appendArrays07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        List<Integer> numbers = new ArrayList<>(Arrays.stream(scanner.nextLine().trim().split("\\s+|\\|"))
//                .filter(s -> !s.isEmpty()).map(Integer::parseInt).toList());
//
//        System.out.println(numbers);

        List<int[]> numbersAgain = Arrays.stream(scanner.nextLine().split("\\|"))
                .map(part -> Arrays.stream(part.trim().split("\\s+"))
                        .filter(s -> !s.isEmpty())
                        .mapToInt(Integer::parseInt)
                        .toArray())
                .collect(Collectors.toList());

//        numbersAgain.forEach(arr -> System.out.println(Arrays.toString(arr)));

        List<Integer> result = new ArrayList<Integer>();
        for (int i = numbersAgain.size() -1; i >= 0; i--){
//            System.out.println(Arrays.toString(numbersAgain.get(i)));
            for (int num : numbersAgain.get(i)) {
                result.add(num);
            }
        }

        for (int number: result) {
            System.out.printf("%d ", number);
        }
    }
}
