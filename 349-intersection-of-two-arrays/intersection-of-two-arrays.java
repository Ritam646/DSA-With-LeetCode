import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        int count = 0;
        for (int num : nums2) {
            if (set.contains(num)) {
                nums1[count++] = num;
                set.remove(num);
            }
        }
        return Arrays.copyOf(nums1, count);
    }
}