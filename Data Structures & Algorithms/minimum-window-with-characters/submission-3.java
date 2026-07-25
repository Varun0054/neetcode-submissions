class Solution {
    public String minWindow(String s, String t) {
        int[] map = new int[128]; // Tracks character counts needed
        for (char c : t.toCharArray()) map[c]++;

        int count = t.length(); // Total characters needed from t
        int left = 0, minLen = Integer.MAX_VALUE, minStart = 0;

        for (int right = 0; right < s.length(); right++) {
            char r = s.charAt(right);
            if (map[r] > 0) count--; // If character was needed, reduce requirement count
            map[r]--; // Decrement available count in map

            // Valid window found when count == 0
            while (count == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                char l = s.charAt(left);
                map[l]++;
                if (map[l] > 0) count++; // If removing l broke the valid condition, increase count needed

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}