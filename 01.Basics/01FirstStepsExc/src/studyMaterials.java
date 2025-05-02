import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;

public class studyMaterials {
    public static void main(String[] args) {
        double pencilsPrice = 5.80;
        double markersPrice = 7.20;
        double acidPerLiter = 1.20;

        Scanner scanner = new Scanner(System.in);

        int pencilsPackages = Integer.parseInt(scanner.nextLine());
        int markersPackages = Integer.parseInt(scanner.nextLine());
        int litersAcid = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

//        double sumWithDiscount = ((pencilsPackages * pencilsPrice) + (markersPackages * markersPrice)
//                + (litersAcid * acidPerLiter) * ((double) percentDiscount / 100));

        double sumAll = (pencilsPackages * pencilsPrice) + (markersPackages * markersPrice)
                + (acidPerLiter * litersAcid);

        double result = sumAll - (sumAll * ((double) percentDiscount / 100));
        System.out.println(result);
    }
}
