//Odd & Even Back in Delhi
import java.util.*;
class Main{

    public static boolean isAllowed(int num) {
        int evenSum = 0;
        int oddSum = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

            num /= 10;
        }

        return (evenSum % 4 == 0) || (oddSum % 3 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        while (N-- > 0) {
            int carNo = sc.nextInt();

            if (isAllowed(carNo)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
