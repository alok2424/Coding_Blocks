//Simple Input
import java.util.*;
 class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        //sc.hasNextInt():It checks whether the next token in the input is an integer or not.
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            sum += n;
            if (sum < 0) {
                break;
            }
            System.out.println(n);
        }
    }
}
