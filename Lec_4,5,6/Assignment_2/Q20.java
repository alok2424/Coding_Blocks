//shopping game
import java.util.*;
class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int M = sc.nextInt();  // max Aayush can buy
            int N = sc.nextInt();  // max Harshit can buy

            int turn = 1;
            int sumA = 0;
            int sumH = 0;

            while (true) {
                if (turn % 2 == 1) {  // Aayush's turn
                    if (sumA + turn > M) {
                        System.out.println("Harshit");
                        break;
                    }
                    sumA += turn;
                } else {              // Harshit's turn
                    if (sumH + turn > N) {
                        System.out.println("Aayush");
                        break;
                    }
                    sumH += turn;
                }
                turn++;
            }
        }
    }
}
