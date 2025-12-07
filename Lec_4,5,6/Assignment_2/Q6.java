import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minF = sc.nextInt();
        int maxF = sc.nextInt();
        int step = sc.nextInt();

        for (int F = minF; F <= maxF; F += step) {
            int C = (int)((5.0 / 9) * (F - 32));  // Celsius conversion
            System.out.println(F + "\t" + C);
        }
    }
}
