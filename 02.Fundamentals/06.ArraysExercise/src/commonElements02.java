import java.util.Scanner;

public class commonElements02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

//        for (int i = 0; i < firstArray.length; i++){
//            for (int j = 0; j < secondArray.length; j++){
//                if (firstArray[i] == secondArray[j]){
//                    System.out.printf("%s ", firstArray[i]);
//                }
//            }
//        }

        for (String secondArrElement: secondArray){
            for (String firstArrElement: firstArray){
                if (firstArrElement.equals(secondArrElement)) {
                    System.out.printf("%s ", secondArrElement);
                }
            }
        }
    }
}
