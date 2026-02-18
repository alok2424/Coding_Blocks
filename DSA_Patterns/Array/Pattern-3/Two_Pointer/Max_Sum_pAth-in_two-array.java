
class Main {

    public static long maxPathSum(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        long sum1 = 0, sum2 = 0;
        long result = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                sum1 += arr1[i++];
            } 
            else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j++];
            } 
            else {
                // Common element found
                result += Math.max(sum1, sum2) + arr1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        // Add remaining elements
        while (i < arr1.length) {
            sum1 += arr1[i++];
        }

        while (j < arr2.length) {
            sum2 += arr2[j++];
        }

        result += Math.max(sum1, sum2);

        return result;
    }
}