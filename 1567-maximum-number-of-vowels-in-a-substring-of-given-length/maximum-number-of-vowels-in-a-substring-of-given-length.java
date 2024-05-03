class Solution {
    public int maxVowels(String s, int k) {
     Set<Character> vowels = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        int n = s.length();  // Get the length of the string
        int maxVowel = 0;  // Max number of vowels in any window of length k
        int currentVowelCount = 0;  // Current count of vowels in the current window

        // Initialize the first window of size k
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {  // Check if the character is a vowel
                currentVowelCount++;  // Increment the vowel count
            }
        }

        maxVowel = currentVowelCount;  // Initialize maxVowel with the first window's count

        // Sliding window from position 1 to n - k
        for (int i = k; i < n; i++) {
            // Remove the leftmost character from the count
            if (vowels.contains(s.charAt(i - k))) {
                currentVowelCount--;
            }

            // Add the new rightmost character to the count
            if (vowels.contains(s.charAt(i))) {
                currentVowelCount++;
            }

            // Update maxVowel with the maximum seen so far
            maxVowel = Math.max(maxVowel, currentVowelCount);
        }

        return maxVowel;  
}
}