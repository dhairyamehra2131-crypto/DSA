class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int digit = 0;
        int n = x;
      
        while(n>0){
            digit += n%10;
            n = n/10;

        }
        if(x%digit == 0){
            return digit;
        }
        return -1;
    }
}