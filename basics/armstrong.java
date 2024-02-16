public class armstrong {
    private static boolean armstrong(int x) {
        // count of digits
        int temp = x;
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int original = x;
        int arm = 0;
        while (x != 0) {
            int rem = x % 10;
            arm = arm + (int) Math.pow(rem, count);
            x = x / 10;
        }

        return (arm == original);
    }

    public static void main(String[] args) {
        System.out.println(armstrong(151));
    }
}
