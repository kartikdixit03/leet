class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
         List<Integer> uniqueKeys1 = new ArrayList<>();
         List<Integer> uniqueKeys2 = new ArrayList<>();
        // List<List<Integer>> uniqueKeys = new ArrayList<>();

        for (int value : nums1) {
            map.put(value, map.getOrDefault(value, 0) + 1); 
        }
        for (int value : nums2) {
            map2.put(value, map.getOrDefault(value, 0) + 1);  
        }

        for (Integer key : map.keySet()){
           if (!map2.containsKey(key)){
             uniqueKeys1.add(key);
           }
        }
        for (Integer key2 : map2.keySet()){
           if (!map.containsKey(key2)){
             uniqueKeys2.add(key2);
           }
        }
    
    return Arrays.asList(uniqueKeys1, uniqueKeys2);

}
}