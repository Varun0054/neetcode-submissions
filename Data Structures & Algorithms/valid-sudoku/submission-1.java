class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < n; j++) {
                char num = board[i][j];

                if (num == '.') {
                    continue;
                }
                if (!set.contains(num)) {
                    set.add(num);
                } else {
                    return false;
                }
            }
        }

        for (int j = 0; j < n; j++) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                char num = board[i][j];

                if (num == '.') {
                    continue;
                }
                if (!set.contains(num)) {
                    set.add(num);
                } else {
                    return false;
                }
            }
        }

        for (int row = 0; row < n; row += 3) {
            for (int col = 0; col < n; col += 3) {
                Set<Character> set = new HashSet<>();

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char num = board[row + i][col + j];
                        if (num == '.') {
                            continue;
                        }
                        if (!set.contains(num)) {
                            set.add(num);
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
