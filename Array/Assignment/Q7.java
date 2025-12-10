//Von Neuman Loves Binary
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start");
        int N = sc.nextInt();
        sc.nextLine(); // clear newline

        int[][] arr = new int[N][];   // 2D jagged array

        // Step 1: input
        for(int i = 0; i < N; i++){
            String s = sc.nextLine();
            arr[i] = new int[s.length()]; // allocate row size

            for(int j = 0; j < s.length(); j++){
                arr[i][j] = s.charAt(j) - '0'; // convert '0'/'1' to int 0/1
            }
        }

        // Step 2: Convert each binary array to decimal
        for(int i = 0; i < N; i++){
            int decimal = 0;
            int power = 1;  // 2^0

            // process from right to left
            for(int j = arr[i].length - 1; j >= 0; j--){
                decimal += arr[i][j] * power;
                power *= 2;
            }

            System.out.println(decimal);
        }
    }
}
