class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left =0;
        double sum = 0;
        double maxAverage = Integer.MIN_VALUE;
    
        for(int right =0; right<nums.length; right++){
                sum += nums[right];
                if(right - left +1 >k){
                    sum -= nums[left];
                    left++;
                }
                if(right - left +1 == k){
               double aMax  = sum/k;

                maxAverage = Math.max(maxAverage,aMax);
                }
        }

      return maxAverage;
    }
}