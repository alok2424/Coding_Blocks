//rotate array
class Main{
    public static int[] rotate_array(int[] arr,int k){
         int n = arr.length;
         k = k % n;
         for(int i = 0;i<k;i++){
            int item = arr[n-1];
            for(int j = n-2;j>=0;j--){
                arr[j+1] = arr[j];
            }
            arr[0] = item;
         }        
         return arr;
    }
}