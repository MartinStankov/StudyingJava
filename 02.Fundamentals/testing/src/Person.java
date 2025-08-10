public class Person {
    private String name;
    private int age;
    private double salary;
    final double minimumSalary = 800.50;


    public Person(String name, int age, double salary){
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    private void setName(String name) {
        if (name.length() < 2) {
            throw new IllegalArgumentException("Name cannot be less than 2 symbols long!");
        }
        this.name = name;
    }

    private String getName() {
        return this.name;
    }

    private void setAge(int age ) {
        if (age <= 0){
            throw new IllegalArgumentException("Age cannot be bellow zero!");
        }
        this.age = age;
    }

    private int getAge () {
        return this.age;
    }

    private void setSalary(double salary) {
        if (salary <= 800) {
            throw new IllegalArgumentException(
                    String.format("Salary cannot be bellow the minimum salary which is %.2f!",
                            minimumSalary));
        }
        this.salary = salary;
    }

    private double getSalary() {
        return this.salary;
    }

    public String getCurrentSalary(Integer hoursWorked){
        return String.format("The current salary for the current hours worked %d is %.2f",
                hoursWorked,
                this.salary * (hoursWorked * 0.3)
                );
    }
}