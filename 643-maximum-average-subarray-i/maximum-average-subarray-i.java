class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;  // Left pointer
        int right = k - 1;  // Right pointer (fixed-size window)
        int sum = 0;

        // Calculate the initial sum for the first k elements
        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }

        int maxSum = sum; // Track the maximum sum

        // Slide the window across the array
        while (right < nums.length - 1) {
            // Move the window: update the sum by adding new element
            // and removing the leftmost element
            sum = sum + nums[right + 1] - nums[left];

            // Update the pointers
            left++; 
            right++;

            // Track the maximum sum
            maxSum = Math.max(maxSum, sum);
        }

        // Convert the maximum sum to an average
        return (double) maxSum / k;
    }
}
