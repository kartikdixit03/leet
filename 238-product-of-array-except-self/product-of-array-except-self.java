class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int zeroCount = 0 ;
        int n = nums.length;
        int [] left = new int[n];
        int [] right = new int[n];
        int [] ans = new int[n];
        right[n - 1] = 1;
        left[0] = 1;
        // if(zeroCount == 0){
            for(int i=1; i<n; i++){
             left[i]= left[i-1] * nums[i-1];
            }

             for(int i=n-2; i>-1; i--){
             right[i]= right[i+1] * nums[i+1];
            }

            for(int i=0; i<n; i++){
             ans[i]= left[i] * right[i];
            }

    return ans;
    }
}