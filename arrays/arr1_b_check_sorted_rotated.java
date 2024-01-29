package arrays;

public class arr1_b_check_sorted_rotated {

    private static boolean check_sorted(int[] a) {
        boolean flag = true;
        if (a[0] > a[1]) {
            // check descending
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] < a[i + 1]) {
                    return false;
                }
            }
        } else {
            // check ascending
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    return false;
                }
            }
        }
        return flag;
    }

    private static boolean check_sorted_rotated(int[] a) {
        // Example of sorted and rotated array.
        // Sorted: {1, 2, 3, 4, 5}
        // Rotated: {3, 4, 5, 1, 2}
        // Incorrect example: {2, 1, 3, 4, 5}

        // Logic: Keep a counter that keep tracks of how many times we find that array
        // is not sorted.
        // If count is 0 then it means array is sorted. If count is 1 means we found a
        // break in array (eg: 3, 4, 5 , 1, 2. Here 5, 1 is a break.).
        // If count is more than 1 that means that array has more than one break or is
        // not sorted.

        // ascending logic
        int break_count = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                break_count++;
            }
        }
        if (a[a.length - 1] > a[0]) {
            break_count++;
        }
        return break_count <= 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5 };
        int[] arr2 = { 5, 6, 9, 1, 8 };
        boolean ans = check_sorted(arr);
        System.out.println(ans);
        boolean ans1 = check_sorted_rotated(arr);
        System.out.println(ans1);
        boolean ans2 = check_sorted_rotated(arr2);
        System.out.println(ans2);
    }
}
