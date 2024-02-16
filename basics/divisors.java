public class divisors {
    private static void divisors_brute(int x) {
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i + " ");
            }
        }
    }

    private static void divisors(int x) {
        for (int i = 1; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                System.out.println(i + " ");
                if (i != x / i) {
                    System.out.println(x / i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        divisors(36);
    }
}
