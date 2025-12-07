//Boston Number
import java.util.Scanner;

class BostonNos{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Boston(n));
    }
    
    public static int Boston(int n) {
        int sum = 0;
        int i = 2;
        int p=n;
        while (n > 1) {
            if (n % i == 0) {
                sum = sum + Sum_of_Digit(i);
                n = n / i;
            } else {
                i++;
            }
        }
        int sum1=Sum_of_Digit(p);
        if(sum==sum1) {
            return 1;
        }
        else {
            return 0;
        }
    }
    public static int Sum_of_Digit(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }

}