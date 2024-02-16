package basics;

public class palindrome {

    private static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int temp = x, mod = 0;
        int rev = 0;
        while (temp != 0) {
            mod = temp % 10;
            rev = rev * 10 + mod;
            temp = temp / 10;
        }
        return (rev == x);
    }

    public static void main(String[] args) {
        int x = 98742893;
        System.out.println(isPalindrome(x));
    }
}
