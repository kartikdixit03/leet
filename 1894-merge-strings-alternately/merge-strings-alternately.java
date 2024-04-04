class Solution {
    public String mergeAlternately(String word1, String word2) {
        int min = Math.min(word1.length(), word2.length());
        String result = "";
        for (int i = 0; i < min; i++) {
            result += word1.charAt(i);
            result += word2.charAt(i); 
        }
        if (word1.length() == word2.length()) {
            return result; 
        } else if (word1.length() > word2.length()) {
            return result + word1.substring(min);
        } else {
            return result + word2.substring(min);
        }
    }
}
