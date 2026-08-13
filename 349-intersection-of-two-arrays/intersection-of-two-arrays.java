import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                }
            }
        }
        int[] result = new int[set.size()];
        int idx = 0;
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            result[idx] = it.next();
            idx++;
        }
        return result;
    }
}