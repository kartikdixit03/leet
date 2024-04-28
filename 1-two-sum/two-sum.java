class Solution {
   public int[] twoSum(int[] nums, int target) {
   
       HashMap<Integer, Integer> map = new HashMap<>();
        
        // Loop through the array to find a pair that sums up to the target
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If the complement exists, return the indices of the pair
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Valid solution found
            }
            
            // Store the current number and its index
            map.put(nums[i], i);
        }

        // Return a special value when no solution is found
        return new int[]{-1, -1}; 
    }
}