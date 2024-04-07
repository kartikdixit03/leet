class Solution {
    public String reverseVowels(String s) {
          if (s == null || s.length() <= 1) {
            return s;
        }

        Set<Character> vowels = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            // Find the first vowel from the beginning
            while (i < j && !vowels.contains(chars[i])) {
                i++;
            }
            // Find the first vowel from the end
            while (i < j && !vowels.contains(chars[j])) {
                j--;
            }
            // Swap vowels at positions i and j
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            // Move pointers inward
            i++;
            j--;
        }

        return new String(chars);
    }
}