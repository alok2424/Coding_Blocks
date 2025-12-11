class Main {
    public static void Rotate(int[] arr,int k){
        int n = arr.length;
        k = k % n;
        // starting ke n-k element Reverse krna hai
        Reverse(arr,0,n-k-1);
        // last ke k element Reverse krna hai
        Reverse(arr,n-k,n-1);
        // saare element Reverse krna hai
        Reverse(arr,0,n-1);
    }
    public static void Reverse(int[] arr,int i,int j){
        while(i>j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}