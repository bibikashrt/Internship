package others;

public class AccessDemo2 {

    private int a = 10;
    int b = 20;
    protected int c = 30;
    public int d = 40;

    public void show() {
        System.out.println("Private a = " + a);
        System.out.println("Default b = " + b);
        System.out.println("Protected c = " + c);
        System.out.println("Public d = " + d);
    }
}
