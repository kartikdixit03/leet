class Solution {
    public int lengthOfLongestSubstring(String s) {
    //    int[] arr = new int[s.length()] 
    int count=0, maxCount =0; 
    int left =0;
    HashSet<Character> set = new HashSet<>();
    for(int right=0; right<s.length(); right++){
    while(set.contains(s.charAt(right))){
            set.remove(s.charAt(left));
            left++;
    }
        if(!set.contains(s.charAt(right))){
            set.add(s.charAt(right));
            System.out.println(set);
            count= right-left+1;
        }
       
        
         maxCount = Math.max(count,maxCount);
    
    }
    return maxCount;

    }
}