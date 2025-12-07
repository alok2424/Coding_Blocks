//Chewbacca and Number
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.next();  // take as string because up to 10^18
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < x.length(); i++) {
            int digit = x.charAt(i) - '0';
            int inverted = 9 - digit;

            int chosen;

            // First digit cannot become 0
            if (i == 0 && digit == 9) {
                chosen = 9;
            } else if (i == 0 && inverted == 0) {
                chosen = digit;   // avoid leading zero
            } else {
                chosen = Math.min(digit, inverted);
            }

            result.append(chosen);
        }

        System.out.println(result.toString());
    }
}
