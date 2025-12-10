//max_value_in_array
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start");
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        int  maxi = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            maxi = Math.max(maxi,arr[i]);
        }
        
        System.out.println(maxi);
    }

}
