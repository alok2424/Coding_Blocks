import java.util.*;

public class Main {
    static final long MOD = 1_000_000_007;

    static long power(long base, long exp) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long sum = 0;

        for (int i = 0; i < N; i++) {
            sum = (sum + sc.nextInt()) % MOD;
        }

        int Q = sc.nextInt();

        for (int i = 0; i < Q; i++) {
            sc.nextInt();
        }

        long result = (sum * power(2, Q)) % MOD;
        System.out.println(result);
    }
}