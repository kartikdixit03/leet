class Solution {
    public int maxArea(int[] height) {
       int left =0 , right = height.length-1;
       int area =0, maxArea=0;
       System.out.println(right);
       while(left<right){
            area = Math.min(height[left], height[right])*(right-left);
            maxArea= Math.max(area,maxArea);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
       } 
       return maxArea;
    }
}