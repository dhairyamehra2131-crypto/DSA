class Solution { 
    public double findMaxAverage(int[] nums, int k) { 
        double average = 0;
        int sum = 0;
        for(int i = 0 ; i<k ; i ++){
             sum += nums[i];
             average = (double) sum/k;
        }
       double maxaverage = average;
        for(int i = 1;i<=nums.length-k;i++){
            sum = sum -nums[i-1]+nums[i+k-1];
            average = (double) sum/k;
            if(average > maxaverage){
    maxaverage = average;
}
        }
       
         return maxaverage;
        
            } 
}