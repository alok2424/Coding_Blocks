import java.util.*;
class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];
        int[][] new_mat = new int[m][n];

        // Input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
                new_mat[i][j] = mat[i][j]; // ✅ copy original
            }
        }

        // Operation
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    for (int k = 0; k < m; k++) {
                        new_mat[k][j] = 1;
                    }
                    for (int l = 0; l < n; l++) {
                        new_mat[i][l] = 1;
                    }
                }
            }
        }

        // Output
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(new_mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
