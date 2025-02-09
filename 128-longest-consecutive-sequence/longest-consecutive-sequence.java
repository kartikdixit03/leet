import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 1;
        int maxCount = 1;
        int n = nums.length;

        if (n == 0) return 0;
        if (n == 1) return 1;

        // Sort array
        Arrays.sort(nums);

        // Print sorted array
        for (int num : nums) {
            System.out.println("Sorted Array: " + num);
        }

        // Process sorted array
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) continue; // Skip duplicates
            
            if (nums[i] - nums[i - 1] == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1; // Reset count for new sequence
            }
        }

        return Math.max(maxCount, count); // Ensure last sequence is counted
    }
}