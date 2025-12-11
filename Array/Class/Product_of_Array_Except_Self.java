//Product of array except self
class Main {
    public static int[] product_of_array(int[] arr){
           int n = arr.length;
           int[] left = new int[n];
           int[] right = new int[n];

           left[0]= 1;
           right[n-1] = 1;

           for(int i=0;i<n;i++){
            left[i] = left[i-1]*arr[i-1];
           }
           for(int j =n-2;j>=0;j--){
            right[j] = right[j+1]*arr[j+1];
           }
           	// calculation
		    for (int i = 0; i < n; i++) {
			left[i] = left[i] * right[i];
		  }
		   return left;
    }
}