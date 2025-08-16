import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class bombNumbers05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList());

        List<Integer> numbersCopy = new ArrayList<>(numbers);

        String[] bombInfo = scanner.nextLine().split(" ");
        int bombNumber = Integer.parseInt(bombInfo[0]);
        int bombPower = Integer.parseInt(bombInfo[1]);

        while (numbers.contains(bombNumber)) {
            int index = numbers.indexOf(bombNumber);

            int left = Math.max(0, index - bombPower);
            int right = Math.min(numbers.size() - 1, index + bombPower);

            for (int i = right; i >= left; i--){
                numbers.remove(i);
            }
        }

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
