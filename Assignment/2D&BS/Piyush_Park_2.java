import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int S = sc.nextInt();

        // CHANGED: int[][] → char[][]
        char[][] garden = new char[N][M];

        // CHANGED: nextInt() → next().charAt(0)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                garden[i][j] = sc.next().charAt(0);
            }
        }

        boolean escaped = true;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                // CHANGED: stop immediately if strength <= K
                if (S <= K) {
                    escaped = false;
                    break;
                }

                // CHANGED: String comparison → char comparison
                if (garden[i][j] == '.') {
                    if (j != M - 1) {
                        S = S - 3; // 2 (.) + 1 step
                    } else {
                        S = S - 2; // no step at last column
                    }
                }

                if (garden[i][j] == '*') {
                    if (j != M - 1) {
                        S = S + 4; // +5 -1 step
                    } else {
                        S = S + 5; // no step at last column
                    }
                }

                // CHANGED: handle # correctly
                if (garden[i][j] == '#') {
                    break; // jump to next row
                }
            }

            if (!escaped) break;
        }

        // FINAL RESULT
        if (escaped && S >= K) {
            System.out.println("Yes");
            System.out.println(S);
        } else {
            System.out.println("No");
        }
    }
}
