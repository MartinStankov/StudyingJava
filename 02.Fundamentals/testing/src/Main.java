import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        var dog = new Dog(10, "Tara");
//        dog.makeSound();
//        dog.eat();
//        dog.getNameOfClass();
//
//        var cat = new Cat(5, "Kitty");
//        cat.makeSound();
//        cat.eat();
//        cat.getNameOfClass();
//
//        var cat1 = new Cat(5, "Kitty");
//
//        System.out.println(cat.equals(cat1));
//
//
//        Animal[] animals = { new Cat(5, "Kitty"), new Dog (2, "Akira")};
//        for (var animal: animals) {
//            System.out.println(animal.getBreed());
//        }

//        Person person1 = new Person("Tony", 20, 950.00);
//        System.out.print(person1.getCurrentSalary(150));
//
//        Person person2 = new Person("Ivan", 21, 400);
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

//        System.out.printf("Minimum value of the array is: %d\n" +
//                "Maximum value of the array is: %d", Arrays.stream(numbers).min().getAsInt(),
//                Arrays.stream(numbers).max().getAsInt());

        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.printf("The minimum value of the array is %d\n" +
                "and the maximum value of the array is %d.", min, max);
    }
}
