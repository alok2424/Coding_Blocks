import java.util.*;

class UnionSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 3, 5};

        List<Integer> union = new ArrayList<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            int val;

            if (arr1[i] < arr2[j]) {
                val = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                val = arr2[j++];
            } else {
                val = arr1[i];
                i++;
                j++;
            }
            if (union.isEmpty() || union.get(union.size() - 1) != val) {
                union.add(val);
            }
        }

        while (i < arr1.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        System.out.println(union);
    }
}
