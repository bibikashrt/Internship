package others;

public class AccessDemo3 extends AccessDemo2 {

    public static void main(String[] args) {
        AccessDemo3 obj = new AccessDemo3();
        System.out.println("Protected c = " + obj.c);
        System.out.println("Public d = " + obj.d);
        AccessDemo2 obj2 = new AccessDemo2();
        System.out.println("Public d = " + obj2.d);

        obj.show();
    }
}
