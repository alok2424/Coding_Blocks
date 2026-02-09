import java.util.*;

public class UnionOfSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 6, 7};

        ArrayList<Integer> union = new ArrayList<>();

        int i = 0, j = 0;
        int n = arr1.length, m = arr2.length;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                addIfNotDuplicate(union, arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                addIfNotDuplicate(union, arr2[j]);
                j++;
            } else {
                addIfNotDuplicate(union, arr1[i]);
                i++;
                j++;
            }
        }

        // Remaining elements
        while (i < n) {
            addIfNotDuplicate(union, arr1[i]);
            i++;
        }

        while (j < m) {
            addIfNotDuplicate(union, arr2[j]);
            j++;
        }

        System.out.println(union);
    }

    private static void addIfNotDuplicate(ArrayList<Integer> list, int val) {
        if (list.isEmpty() || list.get(list.size() - 1) != val) {
            list.add(val);
        }
    }
}
