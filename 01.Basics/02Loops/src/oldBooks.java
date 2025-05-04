import java.util.Scanner;

public class oldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        int count = 0;

        while (true) {
            String currentBook = scanner.nextLine();
            if (currentBook.equals("No More Books")) {
                System.out.printf("The book you search is not here!\nYou checked %d books.", count);
                break;
            }

            if (currentBook.equals(searchedBook)) {
                System.out.printf("You checked %d books and found it.", count);
                break;
            }
            count += 1;

        }

    }
}
