class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int multiply =1;
        int n = nums.length;

        for(int i =0 ; i<n ;i++){
            if(nums[i]==0){
                zeroCount++;
            }
            else{
                multiply = multiply*nums[i];
            }
        }
          if(zeroCount == 0){
            for(int i =0 ; i<n ;i++){
            nums[i] = multiply/nums[i];
            }
          }
          else if(zeroCount==1){
             for(int i =0 ; i<n ;i++){
                 if(nums[i]== 0){
                  nums[i] = multiply;
                 }
                 else {
                      nums[i] = 0;
                 }
             }
          }
             else {
                 for(int i =0 ; i<n ;i++){
            nums[i] =0;
            }
             
          }
          return nums;
    }
}