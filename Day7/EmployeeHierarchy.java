
class Employee {

    void work() {
        System.out.println("Employee works");
    }
}

class Manager extends Employee {

    void manageTeam() {
        System.out.println("Managing team");
    }
}

class Director extends Manager {

    void makeDecision() {
        System.out.println("Director makes decisions");
    }
}

public class EmployeeHierarchy {

    public static void main(String[] args) {

        Director d = new Director();

        d.work();
        d.manageTeam();
        d.makeDecision();
    }
}
