class Solution {
    public int lengthOfLongestSubstring(String s) {
        // An array initialized to 0 by default. 
        // It stores (index + 1) of the character to distinguish 
        // a freshly seen character from default 0 values.
        int[] charIndexMap = new int[128]; 
        
        int left = 0;
        int max_len = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // If charIndexMap[c] > left, it means we've seen 'c' 
            // inside our current window already.
            left = Math.max(left, charIndexMap[c]);
            
            max_len = Math.max(max_len, i - left + 1);
            
            // Store (i + 1) so that index 0 is saved as 1.
            // This eliminates the need for an extra "containsKey" check.
            charIndexMap[c] = i + 1;
        }

        return max_len;
    }
}