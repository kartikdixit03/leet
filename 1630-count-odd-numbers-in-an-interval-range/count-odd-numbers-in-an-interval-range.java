class Solution {
    public int countOdds(int low, int high) {
        // int count = 0;

        // odds = (R + 1) / 2 − L / 2
        if (low > high) return 0;

        int R = (high + 1) /2;
        int L = low/2;

        int oddCount = R -L;


        
        // for(int i= low; i<= high; i++){
        //   if(i%2 !=0){
        //     count++;
        //   }
        // }
        return oddCount;
        
    }
}