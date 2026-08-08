class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder(s);
    
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > 0; j--) {
                if (str.charAt(i) == s.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
