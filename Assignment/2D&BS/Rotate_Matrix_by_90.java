import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        int[][] new_mat = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        // rotate 90 degree anticlockwise
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int I = //new mat
                int J = //new mat
                new_mat[n - 1 - j][i] = mat[i][j];
            }
        }

        // print rotated matrix
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(new_mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
