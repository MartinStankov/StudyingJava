import java.util.*;

public class removeNegativesAndReverse07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = new ArrayList<Integer>(Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList());

        List<Integer> numbersListCopy = new ArrayList<Integer>(numbersList);

        for (int element: numbersListCopy){
            if (element < 0){
                numbersList.remove(Integer.valueOf(element));
            }
        }

        if (numbersList.size() > 0) {
            Collections.reverse(numbersList);
            for (int element: numbersList){
                System.out.printf("%d ", element);
            }
        } else {
            System.out.println("empty");
        }

    }
}
