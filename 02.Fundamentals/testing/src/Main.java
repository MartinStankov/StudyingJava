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
        Animal[] animals = { new Cat(5, "Kitty"), new Dog (2, "Akira")};
        for (var animal: animals) {
            System.out.println(animal.getBreed());
        }
        System.out.println("Hello from Fedora again :)! ");
    }
}
