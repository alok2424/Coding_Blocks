//Running sum of the array
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];   // 2D jagged array

        // Step 1: input
         for(int i =0;i<N;i++){
             arr[i] = sc.nextInt();
         }
         int[] brr = new int[N];
         int sum = 0;
         for(int j = 0;j<arr.length;j++){
             sum += arr[j];
             brr[j] = sum;
         }
         //print new array
         for(int x:brr){
             System.out.print(x+" ");
         }
    
    }
}
