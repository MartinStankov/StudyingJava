import java.util.Scanner;

public class login05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        StringBuilder password = new StringBuilder();

        for (int i = username.length() - 1; i >= 0 ; i--) {
            char currentChar = username.charAt(i);
            password.append(currentChar);
        }

        boolean isLoggedIn = false;

        for (int i = 0; i < 3; i++){
            String passwordGuess = scanner.nextLine();
            if (passwordGuess.equals(password.toString())){
                System.out.printf("User %s logged in.", username);
                isLoggedIn = true;
                break;
            } else{
                System.out.println("Incorrect password. Try again.");
            }
        }

        if (isLoggedIn == false){
            System.out.printf("User %s blocked!", username);
        }
    }
}
