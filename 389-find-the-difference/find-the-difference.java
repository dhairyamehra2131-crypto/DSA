class Solution {
    public char findTheDifference(String s, String t) {
        int sum_s = 0;
        int sum_t = 0;
      for(int i = 0; i<s.length() ; i++){
        sum_s +=s.charAt(i);
      }
        for(int j = 0 ;j<t.length();j++){
            sum_t +=t.charAt(j);
            }
        
       return (char) (sum_t-sum_s);
    }
}