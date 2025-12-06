import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sumOdd = 0;
        int sumEven = 0;
        int pos = 1;

        while (n > 0) {
            int digit = n % 10;

            if (pos % 2 == 1) {
                sumOdd += digit;
            } else {
                sumEven += digit;
            }

            n /= 10;
            pos++;
        }

        System.out.println("Odd_SUM "+sumOdd + "\t" +"EVEn_SUM "+ sumEven);
    }
}
