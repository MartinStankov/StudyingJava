public abstract class Animal {
    public abstract void makeSound();

    public void eat() {
        System.out.println("Animal is eating.");
    }

    private void animalOnlyMethod(){
        System.out.println("ANIMAL ONLY METHOD!");
    }

    public abstract String getNameOfClass();

    public abstract String getBreed();
}
