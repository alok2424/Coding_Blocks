//Reverse_on _array
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        arr = Reverse(arr);

        for(int x:arr){
            System.out.println(x+" ");
        }

    }
    public static int[] Reverse(int[] arr){
        int i =0;
        int j = arr.length -1;

        while(i<j){
            int temp =arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    } 
}