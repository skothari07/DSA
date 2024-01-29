package arrays;

public class arr1_b_linear_search {
    private static int search(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 2, 4, 55, 12 };
        int index = search(arr, 55);
        System.out.println(index);
    }
}
