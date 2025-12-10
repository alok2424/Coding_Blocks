//Array-Linear_Search
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        int M = sc.nextInt();

        int index = find(arr, M);
        System.out.print(index);
    }

    public static int find(int[] arr, int M){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == M){
                return i;  // return index
            }
        }
        return -1; // not found
    }
}
