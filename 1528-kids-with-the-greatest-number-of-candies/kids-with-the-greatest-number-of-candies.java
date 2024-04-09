import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxNumber = Arrays.stream(candies).max().getAsInt();
        List<Boolean> result = new ArrayList<>();
        
      for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxNumber) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
