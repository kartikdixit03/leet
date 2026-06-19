class Solution {
    public int missingNumber(int[] nums) {
        int sum =0;
        int currSum =0;
        for(int i =0; i<nums.length; i++){
            currSum = currSum + nums[i];
            System.out.println(currSum);
        }

        for(int i =1; i<nums.length+1; i++){
            sum = sum + i;
            System.out.print(","+sum);
        }

        return   sum- currSum;

    }
}