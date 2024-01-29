package arrays;

class arr1_b_largest_element {

    /* Linearly parse through array. Compare and update max. Time Complexity O(n) */
    private static int largest_element(int[] arr) {
        int max = Integer.MIN_VALUE;
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /*
     * Another approach is to sort the array first (using Arrays API by java) and
     * then return the last element as largest. Time complexity will be higher
     * O(n*log n)
     */

    public static void main(String[] args) {
        int[] a = { 1, 4, 10, -1, 11 };
        int ans = largest_element(a);
        System.out.println(ans);
    }
}