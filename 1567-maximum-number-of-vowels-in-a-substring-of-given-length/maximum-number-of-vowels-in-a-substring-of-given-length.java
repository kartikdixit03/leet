class Solution {
    public int maxVowels(String s, int k) {
     Set<Character> vowels = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    char[] chars = s.toCharArray();
    int l=0;
    int r=k;
    int i =0;
    int vowelCount = 0, maxVowel=0;
    for ( i = 0; i < k; i++) {
     if (vowels.contains(s.charAt(i))) {  
          vowelCount++;
        }
    }
maxVowel = vowelCount;
      while (r<s.length()) {
        if(vowels.contains(s.charAt(r))){
         vowelCount = vowelCount+1;
         
        }
         if(vowels.contains(s.charAt(l))){
         vowelCount = vowelCount-1;
         
        }
         maxVowel = Math.max(vowelCount,maxVowel);
         l++;
         r++;
}
    return maxVowel; 
}
}