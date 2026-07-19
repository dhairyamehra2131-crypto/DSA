import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int []temp = new int[nums.length];
        int k = 0 ;
for(int i = 0 ;i<nums.length;i++){
    temp[k]=nums[i]*nums[i];
k++;
    }
   Arrays.sort(temp);
   return temp;
    }
    
}