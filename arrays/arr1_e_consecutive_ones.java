package arrays;

public class arr1_e_consecutive_ones {

    private static int count_ones(int[] nums) {
        int largest = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                if (count > largest) {
                    largest = count;
                }
                count = 0;
            }
        }
        return Math.max(count, largest);
    }

    public static void main(String[] args) {
        int[] a = { 1, 1, 0, 1, 1, 1 };
        int ans = count_ones(a);
        System.out.println(ans);
    }
}
