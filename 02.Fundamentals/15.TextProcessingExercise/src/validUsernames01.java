import java.util.Scanner;

public class validUsernames01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for (String username: usernames) {
            if (username.length() <= 3 || username.length() >= 16) {
                continue;
            }
            if (username.matches("^[a-zA-Z0-9_-]+$")) {
                System.out.println(username);
            }
        }
    }
}

/*
Example input:
sh, too_long_username, !lleg@l ch@rs, jeffbutt
Example output:
jeffbutt
 */