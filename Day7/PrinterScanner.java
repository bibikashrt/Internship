
interface Printer {

    void print();
}

interface Scanner {

    void scan();
}

class AllInOneMachine implements Printer, Scanner {

    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }
}

public class PrinterScanner {

    public static void main(String[] args) {

        AllInOneMachine machine = new AllInOneMachine();

        machine.print();
        machine.scan();
    }
}
