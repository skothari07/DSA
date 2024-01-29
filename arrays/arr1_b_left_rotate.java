package arrays;

public class arr1_b_left_rotate {

    private static void rotate(int[] a) {
        int temp = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = temp;
    }

    public static void main(String[] args) {
        int[] a = { 1, 4, 10, -1, 11, 15 };
        rotate(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
