package arrays;

public class arr1_b_second_large_small {

    private static int[] second_small_large(int[] arr) {
        int[] ans = { -1, -1 };
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                ans[0] = largest;
                largest = arr[i];
            } else if (arr[i] > ans[0] && arr[i] != largest) {
                ans[0] = arr[i];
            }
            if (arr[i] < smallest) {
                ans[1] = smallest;
                smallest = arr[i];
            } else if (arr[i] < ans[1] && arr[i] != smallest) {
                ans[1] = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 22, 5, 2, 21, 5, 6, 7, 100, 4 };
        int[] ans = second_small_large(arr);
        System.out.println("Second Smallest: " + ans[1]);
        System.out.println("Second Largest: " + ans[0]);
    }
}
