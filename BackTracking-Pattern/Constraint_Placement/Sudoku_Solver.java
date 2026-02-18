import java.util.*;
class Solution {
    boolean[][] row = new boolean[9][10];
    boolean[][] col = new boolean[9][10];
    boolean[][] box = new boolean[9][10];

    public void solveSudoku(char[][] board) {
        List<int[]> empty = new ArrayList<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') empty.add(new int[]{r, c});
                else {
                    int d = board[r][c] - '0';
                    row[r][d] = col[c][d] = box[boxId(r, c)][d] = true;
                }
            }
        }
        dfs(board, empty, 0);
    }

    private boolean dfs(char[][] b, List<int[]> empty, int idx) {
        if (idx == empty.size()) return true;

        int r = empty.get(idx)[0], c = empty.get(idx)[1];
        int bid = boxId(r, c);

        for (int d = 1; d <= 9; d++) {
            if (row[r][d] || col[c][d] || box[bid][d]) continue;

            b[r][c] = (char) ('0' + d);
            row[r][d] = col[c][d] = box[bid][d] = true;

            if (dfs(b, empty, idx + 1)) return true;

            b[r][c] = '.';
            row[r][d] = col[c][d] = box[bid][d] = false;
        }
        return false;
    }

    private int boxId(int r, int c) {
        return (r / 3) * 3 + (c / 3);
    }
}
