class Solution {
    public int maxSubArray(int[] nums) {
        int sum =0;
        int maxSum =nums[0];
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
            sum = sum + nums[i];
            if(maxSum < sum){
                maxSum =sum;
                System.out.println("maxsum"+maxSum);
            }

            if(sum<0){
                sum =0;
            }
        }

        return maxSum;
    }
}