class Solution {
    public int[] findErrorNums(int[] nums) {
        int []temp = new int[2];
        int n = nums.length;
        
        for(int i = 1 ; i<=n ; i++){
            int count = 0;
            for(int j = 0;j<n;j++){
                if(i==nums[j]){
                    count++;
                }
            }
            if(count == 2){
                temp[0] = i;
               
            }
            if(count == 0){
                temp[1] = i;
            }
        }
return temp;
    }
}