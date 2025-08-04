public class Cat extends Animal {
    private int age;
    private String name;

    public Cat (int age, String name){
        setCatAge(age);
        setCatName(name);
    }

    private void setCatAge(int age) {
        if (age <= 0){
            throw new IllegalArgumentException("Cat age can't be 0 or bellow 0");
        }
        this.age = age;
    }

    private int getCatAge() {
        return age;
    }

    private void setCatName(String name) {
        if (name.length() < 2) {
            throw new IllegalArgumentException("Cat name can't be less than 2 symbols");
        }
        this.name = name;
    }

    private String getCatName(){
        return name;
    }

    @Override
    public void eat() {
        System.out.printf("%s is eating!\n", this.name);
    }

    @Override
    public void makeSound() {
        System.out.printf("%s is making a sound! Meow Meow!\n", name);
    }

    @Override
    public String getNameOfClass(){
        return System.out.printf("%s\n",this.getClass().getSimpleName()).toString();
    }

    @Override
    public String getBreed(){
        return "Cat breed!";
    }
}
