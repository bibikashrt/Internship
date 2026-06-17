
public class ExceptionDemo1 {

    public static void main(String[] args) {
        int i = 2;
        int j = 0;

        int nums[] = new int[5];

        try {
            j = 20 / i;

            System.out.println(nums[6]);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay within your limit");
        }
        System.out.println(j);
    }
}
