package arrays;

public class arr1_b_rotate_k_elements {

    // Approach: Copy original array into temp. Shift all elements by k to the
    // right. Using temp place the last k elements in the starting of the array.
    // Time Complexity: O(n). Space Complexity: O(n).

    // Limitation with brute force: k can be greater than a.length.
    // Have to handle following edge cases:
    // If if(a.length == 1) return;
    // if(k > nums.length) reverse array.
    private static void brute_force_rotate(int[] a, int k) {
        int[] temp = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        for (int j = 0; j < a.length - k; j++) {
            a[j + k] = temp[j];
        }

        for (int l = 0; l < k; l++) {
            a[l] = temp[a.length - k + l];
        }
    }

    // Using the formula:(j + k) % a.length. This shifts elements by k and finds
    // correct index to place in the array.
    private static void brute_force_rotate2(int[] a, int k) {
        int[] temp = new int[a.length];
        for (int j = 0; j < a.length; j++) {
            temp[(j + k) % a.length] = a[j];
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = temp[i];
        }
    }

    // Better approach:
    // k = 2
    // Example: {1, 2, 3, 4, 5, 6}
    // Rotate the entire array: {6,5,4,3,2,1}
    // Rotate first k elements: {5,6,4,3,2,1}
    // Rotate rest of the elements: {5,6,1,2,3,4}
    // Time Complexity: O(n), Space Complexity: O(1)
    private static void rotate(int[] a, int k) {
        int left_index = 0;
        int right_index = a.length - 1;
        int temp = 0;
        while (left_index < right_index) {
            temp = a[left_index];
            a[left_index] = a[right_index];
            a[right_index] = temp;
            left_index = left_index + 1;
            right_index = right_index - 1;
        }
        left_index = 0;
        right_index = k - 1;
        while (left_index < right_index) {
            temp = a[left_index];
            a[left_index] = a[right_index];
            a[right_index] = temp;
            left_index = left_index + 1;
            right_index = right_index - 1;
        }
        left_index = k;
        right_index = a.length - 1;
        while (left_index < right_index) {
            temp = a[left_index];
            a[left_index] = a[right_index];
            a[right_index] = temp;
            left_index = left_index + 1;
            right_index = right_index - 1;
        }
    }

    public static void main(String[] args) {
        int[] a = { 2, 4, 6, 9, 8, 7, 10 };
        rotate(a, 2);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
