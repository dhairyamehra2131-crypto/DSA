class Solution {
    public int findLucky(int[] arr) {

        int[] temp = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == arr[i]) {
                temp[k] = arr[i];
                k++;
            }
        }
        int ans = -1;
        for (int i = 0; i < k; i++) {
            if (temp[i] > ans) {
     ans = temp[i];
            }
        }
        return ans;
    }
}