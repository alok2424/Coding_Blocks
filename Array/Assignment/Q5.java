//Sort_0_1
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        int count_0 = 0;
        int count_1 = 0;

        // Count 0s and 1s
        for(int x : arr){
            if(x == 0){
                count_0++;
            } else if(x == 1){
                count_1++;
            }
        }

        // Print sorted array
        while(count_0 > 0){
            System.out.print("0 ");
            count_0--;
        }

        while(count_1 > 0){
            System.out.print("1 ");
            count_1--;
        }
    }
}
