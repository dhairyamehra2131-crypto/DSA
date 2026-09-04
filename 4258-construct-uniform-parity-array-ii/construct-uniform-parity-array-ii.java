class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        if (n == 1) return true;  // single element always works

        int min = Integer.MAX_VALUE;
        for (int num : nums1) {
            min = Math.min(min, num);
        }

        // Case 1: Minimum is odd → always possible
        if (min % 2 == 1) return true;

        // Case 2: Minimum is even → all must be even
        for (int num : nums1) {
            if (num % 2 == 1) return false;
        }
        return true;
    }
}
