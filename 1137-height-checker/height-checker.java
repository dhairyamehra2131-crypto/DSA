class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int k = 0;
        int []temp = new int [heights.length];
        for(int i = 0;i<heights.length;i++){
temp[k]= heights[i];
k++;
        }
        Arrays.sort(temp);
      for(int i = 0 ; i<heights.length;i++){
     
            if(heights[i] != temp[i]){
                count++;
            }
        
      }
    return count ; 
    }
}