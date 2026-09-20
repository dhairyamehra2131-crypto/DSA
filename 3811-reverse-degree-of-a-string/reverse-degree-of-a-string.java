class Solution {
    public int reverseDegree(String s) {
        int totalsumm = 0;
        for(int i = 0;i<s.length();i++){
            int val = 'z'-s.charAt(i)+1;
            totalsumm += val*(i+1);
        }
        return totalsumm;
    }
}