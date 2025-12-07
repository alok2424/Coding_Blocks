//Print-Series
import java.util.*;
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N1 = sc.nextInt(); // how many terms to print
        int N2 = sc.nextInt(); // skip multiples of this

        int count = 0;
        int n = 1;

        while (count < N1) {
            int val = 3 * n + 2;

            if (val % N2 != 0) {   // print only if NOT divisible by N2
                System.out.println(val);
                count++;
            }

            n++;
        }
    }
}
