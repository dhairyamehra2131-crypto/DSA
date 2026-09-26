class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0 ;
        int diff = 0;
        int digit = 0;
        for(int i = 0;i<nums.length;i++){
            sum +=nums[i];
int temp = nums[i];
while(temp >0){
    digit += temp%10;
    temp = temp/10;
}

        }
        diff = Math.abs(sum - digit);
        return diff;
    }
}