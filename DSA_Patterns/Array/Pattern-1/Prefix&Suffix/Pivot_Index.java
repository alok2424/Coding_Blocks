class Solution {
    public static int Pivot_Index(int[] arr) {
		int n = arr.length;
		int[] left = new int[n];
		int[] right = new int[n];
		left[0] = 0;
		for (int i = 1; i < n; i++) {// prefix
			left[i] = left[i - 1] + arr[i - 1];
		}
		right[n - 1] = 0;
		for (int i = n - 2; i >= 0; i--) {// suffix
			right[i] = right[i + 1] + arr[i + 1];
		}

		// calculation
		for (int i = 0; i < n; i++) {
			if (left[i] == right[i]) {
				return i;
			}
		}
		return -1;
 
	  }
  }
    