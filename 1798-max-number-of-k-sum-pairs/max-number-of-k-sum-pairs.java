import java.util.HashMap;

class Solution {
    public int maxOperations(int[] nums, int k) {
        // Use a hashmap to store the frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        // Loop through each number in the array
        for (int num : nums) {
            // Calculate the complement value that will form a sum of 'k'
            int complement = k - num;

            // Check if there's a complement in the map
            if (map.containsKey(complement) && map.get(complement) > 0) {
                // A pair is found, decrease the complement's count in the map
                count++;
                map.put(complement, map.get(complement) - 1);
            } else {
                // If no complement found, add the current number to the map
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return count; // Returns the total count of pairs whose sum is 'k'
    }
}
