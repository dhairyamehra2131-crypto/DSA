class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int j = 1;
         

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == j) {
            j++;
            }
            else if (nums[i] > j) {
                list.add(j);
                j++;
                i--;
            }
        }
        while(j<=nums.length){
            list.add(j);
            j++;
        }
     
        return list;
    }
}