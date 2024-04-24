import java.util.HashMap;

class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int operationCount = 0;

        for (int num : nums) {
            int complement = k - num;

            // Check if the complement exists in the hashmap
            if (countMap.containsKey(complement) && countMap.get(complement) > 0) {
                operationCount++; // Found a valid pair
                countMap.put(complement, countMap.get(complement) - 1);
            } else {
                // Increment the count for the current number in the hashmap
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }

        return operationCount; // Return the total count of operations
    }
}
