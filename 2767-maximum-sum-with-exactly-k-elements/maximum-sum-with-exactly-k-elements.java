class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max =0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        int sum =  max*k;
        sum += (k*(k-1))/2;
        return sum;

            

    }
}