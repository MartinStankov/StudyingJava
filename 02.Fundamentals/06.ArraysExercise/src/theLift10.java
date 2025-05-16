import java.util.Arrays;
import java.util.Scanner;

public class theLift10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int maxPeoplePerSeat = 4;

        int countOfPeople = Integer.parseInt(scanner.nextLine());
        int[] availableSeats = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int i = 0; i < availableSeats.length; i++){
            if (availableSeats[i] < maxPeoplePerSeat && countOfPeople > 0){
                int peopleToAdd = Math.min(maxPeoplePerSeat - availableSeats[i], countOfPeople);
                availableSeats[i] += peopleToAdd;
                countOfPeople -= peopleToAdd;
            }
        }

        if (countOfPeople == 0){
            boolean isLiftFull = true;
            for (int seat: availableSeats){
                if (seat < maxPeoplePerSeat){
                    isLiftFull = false;
                    break;
                }
            }
            if (!isLiftFull){
                System.out.println("The lift has empty spots!");
                for (int seat: availableSeats){
                    System.out.printf("%d ", seat);
                }
            }else{
                for (int seat: availableSeats){
                    System.out.printf("%d ", seat);
                }
            }
        } else if (countOfPeople > 0){
            System.out.printf("There isn't enough space! %d people in a queue!\n", countOfPeople);
            for (int seat: availableSeats){
                System.out.printf("%d ", seat);
            }
        }



    }
}
