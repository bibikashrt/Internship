
class Employee {

    double salary() {
        return 0;
    }
}

class Manager extends Employee {

    @Override
    double salary() {
        return 50000;
    }
}

class Developer extends Employee {

    @Override
    double salary() {
        return 40000;
    }

    public static void main(String[] args) {
        Employee e = new Manager();
        Employee d = new Developer();
        System.out.println(e.salary());
        System.out.println(d.salary());

    }
}
