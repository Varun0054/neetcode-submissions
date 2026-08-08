class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        for (int i = 0; i < n; i++) {
            set<Character> set = new HashSet<>();
            for (int j = 0; j < n; j++) {
                char num = board[i][j];
                if (num == '.') {
                    continue;
                }
                if (!set.containsKey(num)) {
                    set.add(num);
                }
            }
        }

        for (int j = 0; j < n; j++) {
            set<Character> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                char num = board[i][j];
            }
        }

        for(int row =0; row<n;row+=3){
               set<Character> set = new HashSet<>();
            for(int col =0;col<n;col+=3){

            }
        }
    }
}
