class Solution {
    public int smallestNumber(int n, int t) {
    
        for(int i = n;;i++){
             int temp = i;
             int digit = 1;
            while(temp>0){
                digit *= temp%10;
                temp = temp/10;
            }
            if(digit %t == 0){
                return i ;
            }
        }
        
}
}