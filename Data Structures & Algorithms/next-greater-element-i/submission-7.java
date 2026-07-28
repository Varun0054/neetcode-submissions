class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = nums2.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums2[i] > nums2[stack.peek()]) {
                int index = stack.pop();
                map.put(nums2[index], nums2[i]);
            }
            stack.push(i);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}