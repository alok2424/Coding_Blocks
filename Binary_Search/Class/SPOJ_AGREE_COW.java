import java.util.*;

public class Main {

	public static boolean isItPossible(int[] stalls, int noc, int dist) {
		int idx = 0;
		int i=1;
		int cows = 1;
		
		for(i=1;i<stalls.length;i++) {
			if(stalls[i] - stalls[idx] >=dist) {
				cows++;
				idx=i;
				if(cows==noc) {
					return true;
				}
			}
		}
		
		return false;
		
		
		
		
	}
	
	public static int seatCows(int[] stalls,int noc) {
		int ans = 0;
		int low = 1;
		int high = stalls[stalls.length-1] - stalls[0];
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(isItPossible(stalls,noc,mid) == true) {
				ans= mid;
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		
		
		
		return ans;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int tries = sc.nextInt();
		
		while(tries>0) {
			int nos = sc.nextInt();
			int cows = sc.nextInt();
			
			int[] stalls = new int[nos];
			
			for(int i =0;i<nos;i++) {
				stalls[i] = sc.nextInt();
			}
			Arrays.sort(stalls);
			
			
			int n = seatCows(stalls,cows);
			
			System.out.println(n);
			tries--;
		}
		
		
		
		
		sc.close();

	}

}