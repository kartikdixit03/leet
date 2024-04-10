class Solution {
  public String reverseWords(String s) {
    Stack<String> stack = new Stack<>();
    String[] words = s.split("\\s+");
    for (String word : words) {
      stack.push(word);
    }

    String reversed = "";
    while (!stack.isEmpty()) {
      reversed += stack.pop()+ " ";
    }

    return reversed.trim();
  }

 
        // String[] arr = s.split("\\s+");
        // s = "";
        // for(int i = arr.length-1; i>=0; i--) {
        //     s += (arr[i]+ " ");   
        // }
        // return s.trim();

}