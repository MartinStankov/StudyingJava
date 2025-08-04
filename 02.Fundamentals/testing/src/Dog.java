public class Dog extends Animal {
    private int age;
    private String name;

    public Dog(int age, String name) {
        setDogAge(age);
        setDogName(name);
    }

    private void setDogAge(int age) {
        if (age <= 0){
            throw new IllegalArgumentException("Dog can't be 0 or negative value old!");
        }
        this.age = age;
    }

    private int getDogAge() {
        return age;
    }

    private void setDogName(String name) {
        if (name.length() < 2){
            throw new IllegalArgumentException("Dog name must have at least 2 characters!");
        }
        this.name = name;
    }

    private String getDogName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.printf("%s is making a sound! WOOF WOOF!\n", name);
    }

    @Override
    public void eat() {
        System.out.printf("%s is eating\n", name);
    }

    @Override
    public String getNameOfClass() {
        return System.out.printf("%s\n", this.getClass().getSimpleName()).toString();
    }

    @Override
    public String getBreed() {
        return "Husky or Shiba Inu!";
    }
}
