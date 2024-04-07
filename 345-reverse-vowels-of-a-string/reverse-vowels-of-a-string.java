class Solution {
    public String reverseVowels(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        List<Character> vowelList = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        Set<Character> vowels = new HashSet<>(vowelList);

        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (!vowels.contains(chars[i])) {
                i++;
            } else if (!vowels.contains(chars[j])) {
                j--;
            } else {
                // Swap vowels at positions i and j
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }

        return new String(chars);
    }
}