import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 1;
        int maxCount = 1;
        int n = nums.length;

        if (n == 0) return 0;
        if (n == 1) return 1;
        Arrays.sort(nums);
        for (int num : nums) {
            System.out.println("Sorted Array: " + num);
        }
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) continue; 
            
            if (nums[i] - nums[i - 1] == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1; 
            }
        }

        return Math.max(maxCount, count); 
    }
}