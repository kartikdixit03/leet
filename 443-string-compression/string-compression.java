class Solution {
    public int compress(char[] chars) {
       StringBuilder str = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= chars.length; i++) {
            if (i < chars.length && chars[i] == chars[i - 1]) {
                count++;
            } else {
                str.append(chars[i - 1]);
                if (count > 1) {
                    str.append(count);
                }
                count = 1;
            }
            if (i == chars.length) {
                break;
            }
        }
        str.getChars(0, str.length(), chars, 0);
        return str.length();
    }
}