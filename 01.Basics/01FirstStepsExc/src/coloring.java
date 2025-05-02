import java.util.Scanner;

public class coloring {
    public static void main(String[] args) {
        double nylonPrice = 1.50;
        double paintPerLiter = 14.50;
        double paintThinnerPerLiter = 5.00;

        double percentageMore = 1.1;

        Scanner scanner = new Scanner(System.in);

        int nylonCount = Integer.parseInt(scanner.nextLine());
        int paintLiters = Integer.parseInt(scanner.nextLine());
        int thinnerLiters = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

//        double materialsSum = (nylonCount + (nylonCount * percentageMore)) + (paintLiters + (paintLiters * percentageMore))
//                + (thinnerLiters + (thinnerLiters * percentageMore)) + 0.40;
        double materialsSum = ((nylonCount + 2) * nylonPrice) + ((paintLiters * percentageMore) * paintPerLiter)
                        + (thinnerLiters * paintThinnerPerLiter) + 0.40;

        double workersSum = (materialsSum * 0.3) * 8;

        System.out.println(materialsSum + workersSum);
    }
}
