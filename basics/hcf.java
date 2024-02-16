public class hcf {
    private static int gcd_brute(int a, int b) {
        int gcd = 0;
        for (int i = 1; i < Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    private static int gcd_euclidean(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd_euclidean(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcd_euclidean(68, 12));
    }
}
