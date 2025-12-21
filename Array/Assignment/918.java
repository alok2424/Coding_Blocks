//Maximum Circular Subarray Sum
class Main{
    static int CircularSum(int[] arr){
        int LinearSum = Kadanes_Algo(arr);
        int totalSum = 0;
        for(int i = 0; i<arr.length;i++){
            totalSum += arr[i];
            arr[i] = arr[i] * -1;
        }
        int middle_sum = Kadanes_Algo(arr);
        int circular_sum = totalSum + middle_sum;
        if(circular_sum == 0){
            return LinearSum;
        }
        return Math.max(circular_sum, LinearSum);
    }
    static int Kadanes_Algo(int[] arr){
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            sum+= arr[i];
            ans = Math.max(ans,sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return ans;
    }
}