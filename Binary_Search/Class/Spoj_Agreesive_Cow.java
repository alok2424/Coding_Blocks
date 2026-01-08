//GOOGLE
import java.util.*;
class AgreesiveCow{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     
     int nos = sc.nextInt();//no of stall
     int noc = sc.nextInt();//noc = no of cow

     int[] stall = new int[nos];
     for(int i =0; i<stall.length;i++){
        stall[i] = sc.nextInt();
     }
     //sort the array
     Arrays.sort(stall);
    }
    public static int LargestMinDis(int[] stall,int noc){
        int low = 1;
        int high = stall[stall.length-1] - stall[0];
        int ans =  0;
        while(low<= high){
            int mid =(low+high)/2;
            if(isitpossible(stall,noc,mid)==true){
               ans = mid;
               low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int[] stall, int noc,int mid){
        int pos = stall[0];//fixed method
        int cow = 1;
        for(int i =1; i<stall.length;i++){
            if(stall[i] - pos >= mid){//stall[i] = abhi jis stall pe hai
            //pos = previous stall
                cow++;//kitne cow baith gye
                pos = stall[i];//update kar rahe hau previous stall ko
            }
            if(cow == noc){
                return true;
            }
        }
        return false;
    }
}