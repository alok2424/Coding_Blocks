import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt(); // no of paratha
        int L = sc.nextInt(); // no of cook
        int[] R = new int[L];
        for (int i = 0; i < L; i++) {
            R[i] = sc.nextInt(); // rank of cook
        }
        Arrays.sort(R); // needed for max rank
        int max_rank = R[R.length - 1];

        int ans = 0;
        int low = 1;
        int high = max_rank * P * (P + 1) / 2;//how to find search space

        while (low <= high) {
            int mid = (low + high) / 2;
            int curr_paratha = 0;
            // calculate parathas in 'mid' time
            for (int i = 0; i < L; i++) {
                int time = 0;//total time spent by current cook
                int cnt = 1;//which parantha number the cook is making
                while (time + cnt * R[i] <= mid) {//Can the cook make the next parantha without exceeding mid time?
                    time += cnt * R[i];//Add time for current parantha
                    curr_paratha++;//Increase total paratha count
                    cnt++;//Move to next parantha
                }   
            }
            if (curr_paratha >= P) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
