import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int n : nums) { 
            if (count.containsKey(n)) {
                count.put(n, count.get(n) + 1);
            } else {
                count.put(n, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(count.entrySet());

        entryList.sort((a, b) -> b.getValue() - a.getValue());

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = entryList.get(i).getKey();  
        }

        return res;
    }
}