class Solution {
    public int smallestEvenMultiple(int n) {
        int m = n*2;
        int k = 0 ;
        int []temp = new int[n];
        for(int i = 1;i<=m;i++){
            if(i%2 == 0 && i%n == 0){
temp[k] = i;
k++;
            }
        }
        return temp[0];
    }
}