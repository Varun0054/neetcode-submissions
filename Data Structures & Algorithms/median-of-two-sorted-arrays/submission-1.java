class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length ;
        double ans = 0;
        int res[] = new int[n];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            res[nums1.length + i] = nums2[i];
        }
        Arrays.sort(res);
        int mid = n / 2;

        if (res.length % 2 == 0) {
            ans = (res[mid - 1] + res[mid]) / 2.0;
        } else {
            ans = res[mid];
        }

        return ans;
    }
}
