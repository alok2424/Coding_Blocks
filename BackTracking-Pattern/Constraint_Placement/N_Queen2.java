class Solution {
    int count = 0;

    public int totalNQueens(int n) {
        boolean[] col = new boolean[n];
        boolean[] d1 = new boolean[2 * n];
        boolean[] d2 = new boolean[2 * n];
        dfs(0, n, col, d1, d2);
        return count;
    }

    private void dfs(int r, int n, boolean[] col, boolean[] d1, boolean[] d2) {
        if (r == n) { count++; return; }

        for (int c = 0; c < n; c++) {
            int id1 = r - c + n, id2 = r + c;
            if (col[c] || d1[id1] || d2[id2]) continue;

            col[c] = d1[id1] = d2[id2] = true;
            dfs(r + 1, n, col, d1, d2);
            col[c] = d1[id1] = d2[id2] = false;
        }
    }
}
