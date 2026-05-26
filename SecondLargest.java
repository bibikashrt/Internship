
class SecondLargest {

    int findSecond(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > first) {
                second = first;
                first = n;
            } else if (n > second && n != first) {
                second = n;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        SecondLargest obj = new SecondLargest();
        System.out.println(obj.findSecond(new int[]{10, 20, 5, 8}));
    }
}
