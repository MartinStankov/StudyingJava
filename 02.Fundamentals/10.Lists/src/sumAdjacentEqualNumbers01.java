import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sumAdjacentEqualNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbersList = new ArrayList<> (Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).toList());

//        System.out.println(numbersList);
//        System.out.println(numbersList.toArray().length);
//        System.out.println(numbersList.size());
        for (int i = 0; i < numbersList.size() - 1; i++){
            double firstElement = numbersList.get(i);
            double secondElement = numbersList.get(i + 1);

            if (firstElement == secondElement){
                numbersList.set(i, firstElement + secondElement);
                numbersList.remove(i + 1);

                i = -1;
            }
        }

        System.out.println(joinElementByDelimiter(numbersList, " "));
    }

    static String joinElementByDelimiter(List<Double> list, String delimiter){
        String result = "";
        for (double num: list){
            DecimalFormat df = new DecimalFormat("0.#");

            String numFormat = df.format(num) + delimiter;

            result += numFormat;
        }
        return result;
    }
}
