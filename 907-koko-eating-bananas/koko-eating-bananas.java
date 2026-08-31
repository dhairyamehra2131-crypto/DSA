class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       long  start = 1;
       long  end = 1000000000L;
       while(start<=end){
        long k = start+(end-start)/2;
        long hours=0;
        for(int pile:piles){
hours += (pile+k-1)/k;
        }
       if (hours <= h) {
                end = k - 1;
            } else {
                start = k + 1;
            }
        }
        return (int) start;
    }
}