class MathOperation {

    int multiply(int a,int b) {

        return a*b;
    }

    int multiply(int a,int b,int c) {

        return a*b*c;
    }
}

public class OverloadDemo {

    public static void main(String[] args) {

        MathOperation m=new MathOperation();

        System.out.println(m.multiply(2,3));

        System.out.println(m.multiply(2,3,4));
    }
}