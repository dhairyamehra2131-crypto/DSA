class Solution {
    public int countDigits(int num) {
      int temp = num;
      int count = 0;
      int digit = 0;
      while(temp >0){
digit = temp %10;
if(num %digit == 0){
    count++;
}
temp = temp /10;
      }
    
    return count;
    }
}