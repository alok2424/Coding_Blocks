import java.util.*;

class TwoSumTwoPointer {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                System.out.println(arr[i] + " " + arr[j]);
                return;
            }else if (sum < target) {
                i++;
            }else {
                j--;
            }
        }

        System.out.println("No pair found");
    }
}
