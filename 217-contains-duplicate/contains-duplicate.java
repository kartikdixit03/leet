import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int n: nums){
            if(count.containsKey(n)){
                return true;
            }
            count.put(n,count.getOrDefault(n,0)+1);
        }
        return false;
    }
}