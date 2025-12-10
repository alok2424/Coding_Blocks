//Squares of Sorted Array
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
        arr = Square(arr);
        Arrays.sort(arr);
        //print the array
        for(int x:arr){
            System.out.print(x+" ");
        }
    }

    public static int[] Square(int[] arr){
        for(int i = 0; i<arr.length;i++){
            arr[i]  = arr[i]*arr[i];
        }
        return arr;
    }
}
