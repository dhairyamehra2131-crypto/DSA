class Solution {
    public String clearDigits(String s) {
        char[] arr = s.toCharArray();
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                k--;
            } else {
            arr[k] = arr[i];
           k++;
            }
        }
        return new String(arr, 0, k);
    }
}