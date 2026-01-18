import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[m];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();

            int i = 0, j = 0;
            long sum1 = 0, sum2 = 0, result = 0;

            while (i < n && j < m) {
                if (a[i] < b[j]) {
                    sum1 += a[i++];
                } else if (a[i] > b[j]) {
                    sum2 += b[j++];
                } else { 
                    result += Math.max(sum1, sum2);
                    result += a[i]; 
                    sum1 = 0;
                    sum2 = 0;
                    i++;
                    j++;
                }
            }

            while (i < n) sum1 += a[i++];
            while (j < m) sum2 += b[j++];

            result += Math.max(sum1, sum2);

            System.out.println(result);

    }
}
}