//TC = O(n); SC = O(1)
class Main{
     public static void main(String[] args) {
         
     }
     public static int pivot(int[] arr){
        int n = arr.length;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum+= arr[i];
        }
        int left = 0;
        for(int i = 0;i<n;i++){
            int right = sum-left-arr[i];
             if(left == right){
            return i;
         }
         left += arr[i];
        }   
        return -1;
     }
}