package basics;

public class count_digits {

    private static int count(int n) {
        int i = n;
        int count = 0;
        while (i != 0) {
            i = i / 10;
            count++;
        }
        return count;
    }

    private static int count_optimal(int n) {
        int count = 0;
        String s = Integer.toString(n);
        count = s.length();
        return count;
    }

    public static void main(String[] args) {
        int n = 10039;
        System.out.println(count_optimal(n));
    }
}