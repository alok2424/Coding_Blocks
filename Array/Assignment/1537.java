class Get_the_Maximum_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2,3,7,10,12,15,30,34};
		int[] arr2 = {1,5,7,8,10,15,16,19};
	}
	public static int Maximum_Score(int[] arr1, int[] arr2) {
		int i = 0, j=0, s1=0, s2=0;
		long ans = 0;
		int mod=1000_000_007;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr1[i]>arr2[j]) {
				j++;
			}
			else {
				long sum1=sumofarray(arr1,s1,i);
				long sum2=sumofarray(arr1,s2,j);
				ans = (ans + Math.max(sum1, sum2)) % mod;
				i++;
				j++;
				s1 = i;
				s2 = j;
			}
		}
		long sum1=sumofarray(arr1,s1, arr1.length-1);
		long sum2=sumofarray(arr1,s2,arr2.length-1);
		ans = (ans + Math.max(sum1, sum2)) % mod;
		
		return (int) (ans);
	}
	public static long sumofarray(int[] arr, int si, int ei) {
		long sum =0;
		for (int j = si; j <= ei; j++) {
			sum+=arr[j];
		}
		return sum;
	}

}