//pivot_index2.java
class Main{
    public static void main(String[] args){

    }
    public static int Pivot(int[] arr){
        int n = arr.length;
        int[] leftSum = new int[n];
        int[] rightSum =new int[n];

        leftSum[0] = 0;
        for(int i=1;i<n;i++){
            leftSum[i] = leftSum[i-1]+arr[i-1];
        }
        rightSum[n-1] = 0;
        for(int i=n-2;i>=0;i--){
            rightSum[i] = rightSum[i+1] + arr[i+1];
        }
        
        //calculation
        for(int i =0;i<n;i++){

        if(leftSum == rightSum){
            return i;
        }
        }
        return -1;
    }
}