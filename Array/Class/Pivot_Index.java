class Main{
   
    public static int Pivot(int[] arr){
        int n = arr.length;
        for(int i =0;i<n;i++){
            int leftSum = sum(arr,0,i-1);
            int rightSum = sum(arr,i+1,n-1);

            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
    public static int sum(int[] arr,int i,int j){
        int ans = 0;
        for(int k = i; k <= j;k++){
           ans+= arr[k];
        }
        return ans;
    }
}