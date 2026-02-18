import java.util.*;

class StockSpan {
    public static void span(int[] arr) {
        Stack<Integer> st = new Stack<>(); // stores indices
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
                st.pop();
            }

            // calc span
            ans[i] = st.isEmpty() ? i+1 : i- st.peek();
            
            st.push(i);
        }

        // print spans
        for (int x : ans) System.out.print(x + " ");
    }

    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        span(arr); // 1 1 1 2 1 4 6
    }
}
