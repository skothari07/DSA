package basics;

public class reverse_number {

    // Time Complexity: O(n)
    private static int reverse(int x) {
        int num = 0;
        int rem;
        // To handle both negative and positive number.
        int n = Math.abs(x);
        while (n != 0) {
            rem = n % 10;
            // Overflow: if reverse is greater than interger limit. Return 0;
            if (num > (Integer.MAX_VALUE - rem) / 10) {
                return 0;
            }
            num = num * 10 + rem;
            n = n / 10;
        }
        if (x < 0) {
            return -num;
        } else {
            return num;
        }
    }

    public static void main(String[] args) {
        int n = 23798;
        System.out.println(reverse(n));
    }
}
