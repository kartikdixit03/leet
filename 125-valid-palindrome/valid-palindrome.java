class Solution {
    public boolean isPalindrome(String s) {
        String opr = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int left = 0 ,right = opr.length()-1;
        while(left<right){
            if(opr.length()==1) {return true;}
             if (opr.charAt(left) != opr.charAt(right)){return false;}
            else{left++; right--;} }
        return true;
    }
}