class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        if (n > 10) n = 10; // only 10 digits exist

        int ans = 10;   // for n=1 => 0..9
        int unique = 9; // first digit: 1..9
        int avail = 9;  // remaining choices

        for (int len = 2; len <= n; len++) {
            unique *= avail;
            ans += unique;
            avail--;
        }
        return ans;
    }
}
