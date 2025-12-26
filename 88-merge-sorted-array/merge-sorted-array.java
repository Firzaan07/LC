class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int[] ans = new int[m + n];
        int l = 0, r = 0, k = 0;

        while (l < m && r < n) {
            if (nums1[l] < nums2[r]) {
                ans[k++] = nums1[l++];
            } else {
                ans[k++] = nums2[r++];
            }
        }

        while (r < n) {
            ans[k++] = nums2[r++];
        }

        while (l < m) {
            ans[k++] = nums1[l++];
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = ans[i];
        }
    }
}