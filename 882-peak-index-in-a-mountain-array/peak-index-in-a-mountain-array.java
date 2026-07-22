class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean peak = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[j] > arr[i]) {
                    peak = false;
                    break;
                }
            }
            if (peak) {
                index = i;
                return index;
            }
        }
        return -1;
    }
}