//isArmStrong
import java.util.*;
class Main{

    public static boolean isArmstrong(int num) {
        int original = num;

        // count digits
        int digits = 0;
        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // compute sum of digits^digits
        int sum = 0;
        temp = num;
        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (isArmstrong(n)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
