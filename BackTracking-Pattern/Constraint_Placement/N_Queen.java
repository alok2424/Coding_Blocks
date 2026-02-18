import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');

        boolean[] col = new boolean[n];
        boolean[] d1 = new boolean[2 * n]; // row - col + n
        boolean[] d2 = new boolean[2 * n]; // row + col

        dfs(0, n, board, col, d1, d2, ans);
        return ans;
    }

    private void dfs(int r, int n, char[][] board, boolean[] col, boolean[] d1, boolean[] d2, List<List<String>> ans) {
        if (r == n) {
            List<String> out = new ArrayList<>();
            for (int i = 0; i < n; i++) out.add(new String(board[i]));
            ans.add(out);
            return;
        }

        for (int c = 0; c < n; c++) {
            int id1 = r - c + n, id2 = r + c;
            if (col[c] || d1[id1] || d2[id2]) continue;

            board[r][c] = 'Q';
            col[c] = d1[id1] = d2[id2] = true;

            dfs(r + 1, n, board, col, d1, d2, ans);

            board[r][c] = '.';
            col[c] = d1[id1] = d2[id2] = false;
        }
    }
}
