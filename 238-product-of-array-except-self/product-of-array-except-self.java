class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product =1;
        int n = nums.length;
        int zerCount = 0;
        for(int i =0; i<n; i++){
            if(nums[i] == 0){
                zerCount++;
                if(zerCount>1){
                    product =0;
                    break;
                } 
            }
            else{
                product= nums[i] * product;
            }
        }

        for(int i =0; i<n; i++){
            if(zerCount == n){
                return nums;
            }

            if(product == 0){
                nums[i]=0;
            }
            else if(zerCount==1){
                if(nums[i]!=0){
                    nums[i] =0;
                }else{
                    nums[i] = product;
                }
            }
            
            else{
                nums[i] = product/nums[i];
            }
        }
        return nums;
    }
}
