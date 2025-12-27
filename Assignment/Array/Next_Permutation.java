import java.util.*;
class Main {
    public static  void swap(int arr[] , int i  , int j){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }

    public static void reverse(int arr[] , int i , int j){
            int s = i ;
            int e = j ;

            while(s<=e){
                swap(arr,s,e);
                s++;
                e--;
            }
    }

    public static void next_perm(int arr[]){
        int n = arr.length ;
        int p = -1 ;
        int q = -1 ;

        for(int i = n-2 ; i>=0 ; i--){
            if(arr[i] < arr[i+1]){
                p = i ;
                break ;
            }
        }

        if (p == -1) {
			reverse(arr, 0, arr.length - 1);
			return;
		}

        for(int i = n-1 ; i>=0 ;i--){
            if(arr[i] > arr[p]){
                q = i ;
                break ;
            }
        }

        swap(arr , p , q) ;
        reverse(arr,p+1 , arr.length-1);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in) ;
        int n =  sc.nextInt() ;

        int arr[] = new int[n] ;

        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt() ;
        }

        next_perm(arr);

        for(int i = 0 ; i<n ;i++){
            System.out.print(arr[i] + " ");
        }

    }
}