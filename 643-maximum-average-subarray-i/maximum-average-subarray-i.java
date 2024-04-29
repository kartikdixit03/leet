class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        } 
        double maxAvg = (double) sum / k;
        for (int r = k; r < nums.length; r++) {
            sum += nums[r] - nums[r - k]; 
            maxAvg = Math.max(maxAvg, (double) sum / k); 
        }
        return maxAvg;
    }
}
