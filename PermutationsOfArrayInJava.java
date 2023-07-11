import java.util.Arrays;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3,4};
        generatePermutations(nums);
    }

    public static void generatePermutations(int[] nums) {
        permute(nums, 0, nums.length - 1);
    }

    public static void permute(int[] nums, int start, int end) {
        if (start == end) {
            System.out.println(Arrays.toString(nums));
        } else {
            for (int i = start; i <= end; i++) {
                swap(nums, start, i);
                permute(nums, start + 1, end);
                swap(nums, start, i); // backtrack
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
