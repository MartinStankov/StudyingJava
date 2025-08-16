import java.util.*;

public class cardsGame06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstHand = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList());

        List<Integer> secondHand = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList());

        for (int i = 0; i < firstHand.size(); i++) {
            if (firstHand.size() <= 0 || secondHand.size() <= 0) {
                break;
            }

            int firstHandCard = firstHand.get(i);
            int secondHandCard = secondHand.get(i);

            if (firstHandCard == secondHandCard) {
                firstHand.remove(i);
                secondHand.remove(i);
                i--;
            } else if (firstHandCard > secondHandCard) {
                firstHand.addLast(firstHandCard);
                firstHand.addLast(secondHandCard);
                firstHand.remove(i);
                secondHand.remove(i);
                i--;
            } else if (secondHandCard > firstHandCard) {
                secondHand.addLast(secondHandCard);
                secondHand.addLast(firstHandCard);
                secondHand.remove(i);
                firstHand.remove(i);
                i--;
            }
        }


        int firstHandSum = firstHand.stream().mapToInt(Integer::intValue).sum();
        int secondHandSum = secondHand.stream().mapToInt(Integer::intValue).sum();

        if (firstHandSum > secondHandSum) {
            System.out.printf("First player wins! Sum: %d", firstHandSum);
        } else {
            System.out.printf("Second player wins! Sum: %d", secondHandSum);
        }
    }
}
