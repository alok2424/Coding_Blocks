import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int S = sc.nextInt();

        // STEP 1: create garden
        char[][] garden = new char[N][M];

        // STEP 2: take input
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                garden[i][j] = sc.next().charAt(0);
            }
        }

        // STEP 3: call function
        int result = canEscape(garden, N, M, S, K);

        if (result != -1) {
            System.out.println("Yes");
            System.out.println(result);
        } else {
            System.out.println("No");
        }
    }

    public static int canEscape(char[][] garden, int N, int M, int S, int K) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                if (S <= K) {
                    return -1; // escape failed
                }

                if (garden[i][j] == '.') {
                    if (j != M - 1) S -= 3;
                    else S -= 2;
                }

                if (garden[i][j] == '*') {
                    if (j != M - 1) S += 4;
                    else S += 5;
                }

                if (garden[i][j] == '#') {
                    break; // jump to next row
                }
            }
        }
        return S; // escape successful
    }
}
