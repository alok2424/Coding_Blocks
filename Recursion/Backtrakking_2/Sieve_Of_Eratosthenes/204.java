class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        return CountPrime(n);
    }

    public static int CountPrime(int n) {
        int[] prime = new int[n];
        prime[0] = 1; // not prime
        prime[1] = 1; // not prime

        for (int i = 2; i * i < n; i++) {
            if (prime[i] == 0) { // i is prime
                for (int j = i * i; j < n; j += i) {
                    prime[j] = 1;
                }
            }
        }
        
        int c = 0;
        for (int i = 2; i < n; i++) {
            if (prime[i] == 0) {
                c++;
            }
        }
        return c;
    }
}
