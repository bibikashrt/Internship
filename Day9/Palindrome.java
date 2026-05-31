
class Palindrome {

    boolean isPalindrome(int n) {
        int rev = 0, temp = n;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return temp == rev;
    }

    public static void main(String[] args) {
        System.out.println(new Palindrome().isPalindrome(121));
    }
}
