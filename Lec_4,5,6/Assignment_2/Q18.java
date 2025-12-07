//Boston Number
import java.util.*;
class Main{

    // function to compute sum of digits of a number
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    // function to compute sum of digits of prime factors
    public static int sumPrimeFactorsDigits(int n) {
        int sum = 0;
        // check for factor 2
        while (n % 2 == 0) {
            sum += sumOfDigits(2);
            n /= 2;
        }
        // check odd factors
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                sum += sumOfDigits(i);
                n /= i;
            }
        }
        // if n is still > 1, it is a prime factor
        if (n > 1) {
            sum += sumOfDigits(n);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int sumOriginal = sumOfDigits(N);
        int sumFactors = sumPrimeFactorsDigits(N);

        if (sumOriginal == sumFactors) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
