
abstract class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void calculateSalary();

    void display() {
        System.out.println("Employee Name: " + name);
    }
}

interface Bonus {

    void giveBonus();
}

class Developer extends Employee implements Bonus {

    Developer(String name) {
        super(name);
    }

    @Override
    void calculateSalary() {
        System.out.println("Salary: Rs 50,000");
    }

    @Override
    public void giveBonus() {
        System.out.println("Bonus: Rs 5,000");
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Developer d = new Developer("Sheron");

        d.display();
        d.calculateSalary();
        d.giveBonus();
    }
}
