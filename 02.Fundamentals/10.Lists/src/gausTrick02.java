import java.util.*;

public class gausTrick02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList());

        int numbersSize = numbers.size();
        for (int i = 0; i < numbersSize / 2; i++){
//            numbers.set(i, numbers.get(i) + numbers.getLast());
//            numbers.remove(numbers.getLast());
            int firstNum = numbers.get(i);
            int secondNum = numbers.get(numbers.size() - 1);
            numbers.set(i, firstNum + secondNum);
            numbers.remove(numbers.size() - 1);
        }
        
        for (int number: numbers){
            System.out.print(number + " ");
        }
    }
}
