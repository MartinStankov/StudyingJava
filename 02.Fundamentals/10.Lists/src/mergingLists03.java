import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class mergingLists03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

//        int[] firstList = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(
//                Integer::parseInt).toArray();
//        int[] secondList = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(
//                e -> Integer.parseInt(e)).toArray();
//        List<Integer> firstList = new ArrayList<Integer>(Arrays.stream(scanner.nextLine().split(" "))
//                .map(e -> Integer.parseInt(e)).toList());
//
//        List<Integer> secondList = new ArrayList<Integer>(Arrays.stream(scanner.nextLine().split(" "))
//                .map(Integer::parseInt).toList());
//
//        int[] result = new int[]{ firstList, secondList};
        //Technically still works but gives the numbers in a different order

//        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
//        finalList.add(firstList);
//        finalList.add(secondList);
////        System.out.println(finalList.toString());
//
//        for (List<Integer> list: finalList) {
//            for (int num: list){
//                System.out.printf("%d ", num);
//            }
//        }

        List<Integer> firstList = new ArrayList<Integer>(Arrays.stream(scanner.nextLine().split(" "))
                .map(e -> Integer.parseInt(e)).toList());

        List<Integer> secondList = new ArrayList<Integer>(Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList());

        int secondListInitialSize = secondList.size();

        List<Integer> finalList = new ArrayList<Integer>();
        for (int firstListElement: firstList){
            finalList.add(firstListElement);
            for (int secondListElement: secondList) {
                finalList.add(secondListElement);
                secondList.removeFirst();
                break;
            }
        }

        if (secondListInitialSize > firstList.size()){
            for (int element: secondList) {
                finalList.add(element);
            }
        }

        for (int element: finalList){
            System.out.printf("%d ", element);
        }
    }
}
