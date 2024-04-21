class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum =0 , rsum =0 , max =0;
        int n = cardPoints.length;
         for (int i = 0; i < k; i++) {
            lsum += cardPoints[i];
        }
        max = lsum;
       
        for (int i = k - 1; i >= 0; i--) {
            lsum = lsum - cardPoints[i] ;
            rsum += cardPoints[n - 1];
            n= n-1; 
                  max = Math.max(max, lsum+rsum);
         }
         System.out.println(max);
         System.out.println(lsum+rsum);
  
         return max;
    }
}