class Solution {
    public int peakValleyDifference(int[] nums) {
        int n = nums.length;
        int peaksum = 0;
        int vsum = 0;
        int f = 0 ;
        for(int i = 1 ; i<n-1;i++){
if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
    peaksum += nums[i];
}
if(nums[i]<nums[i-1] && nums[i]<nums[i+1]){
    vsum += nums[i];
}
f = peaksum - vsum;
        }
        return f;
    }
}