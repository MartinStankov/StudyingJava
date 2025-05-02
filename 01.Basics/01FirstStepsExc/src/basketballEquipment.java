import java.util.Scanner;

public class basketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearTax = Integer.parseInt(scanner.nextLine());

        double shoesPrice = yearTax * 0.6;
        double outfitPrice = shoesPrice * 0.8;
        double ballPrice = outfitPrice / 4;
        double accessoriesPrice = ballPrice / 5;

        System.out.println(yearTax + shoesPrice + outfitPrice + ballPrice + accessoriesPrice);
    }
}
