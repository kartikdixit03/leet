class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // HashMap<Integer, Integer> map2 = new HashMap<>();

         HashSet<Integer> map = new HashSet<>();
        HashSet<Integer> map2 = new HashSet<>();
         List<Integer> uniqueKeys1 = new ArrayList<>();
         List<Integer> uniqueKeys2 = new ArrayList<>();
        // List<List<Integer>> uniqueKeys = new ArrayList<>();

        for (int value : nums1) {
            map.add(value);  // Use set to ensure uniqueness
        }
        
        for (int value : nums2) {
            map2.add(value);  // Use set to ensure uniqueness
        }
        // for (int value : nums1) {
        //     map.put(value, map.getOrDefault(value, 0) + 1); 
        // }
        // for (int value : nums2) {
        //     map2.put(value, map.getOrDefault(value, 0) + 1);  
        // }

        for (Integer key : map){
           if (!map2.contains(key)){
             uniqueKeys1.add(key);
           }
        }
        for (Integer key2 : map2){
           if (!map.contains(key2)){
             uniqueKeys2.add(key2);
           }
        }
    
    return Arrays.asList(uniqueKeys1, uniqueKeys2);

}
}