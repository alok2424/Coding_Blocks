import java.util.*;
class Main{

    public static boolean isArmstrong(int num) {
        int original = num;
        int digits = 0;

        // Count digits
        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Calculate sum of digits^digits
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

        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        for (int i = N1; i <= N2; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
}
