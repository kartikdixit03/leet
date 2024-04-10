class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        String[] words = s.split("\\s+");
        for (String word : words) {
            stack.push(word);
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop() + " ";
        }
        return reversed.trim(); 
    }
}
