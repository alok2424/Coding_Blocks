class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (dfs(board, word, r, c, 0)) return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] b, String w, int r, int c, int idx) {
        if (idx == w.length()) return true;
        if (r < 0 || c < 0 || r >= b.length || c >= b[0].length) return false;
        if (b[r][c] != w.charAt(idx)) return false;

        char tmp = b[r][c];
        b[r][c] = '#'; // mark visited

        boolean ok = dfs(b, w, r + 1, c, idx + 1) ||
                     dfs(b, w, r - 1, c, idx + 1) ||
                     dfs(b, w, r, c + 1, idx + 1) ||
                     dfs(b, w, r, c - 1, idx + 1);

        b[r][c] = tmp; // undo
        return ok;
    }
}
