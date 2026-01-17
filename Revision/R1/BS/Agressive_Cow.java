import java.util.*;
class Main{ 
    public static void main(String[] args){
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
          int low  = 1;
          int high = stall[stall.length-1] - stall[0];
          int ans = 0;
          while(low<= high){
            int mid = (low+high)/2;
            if(isItPossible(stall,noc,mid)==true){
                   ans = mid;
                   low= mid+1;
            }else{
                high = mid-1;
            }
          }
          return ans;
    }
    public static boolean isItPossible(int[] stall,int noc,int mid){
        int pos = stall[0];//first stall
        int cow = 1;//one cow can sit on first stall
        for(int i = 1; i<stall.length;i++){//starting from next stall
            if((stall[i]-pos)>= mid){//check the difference between two stall
              cow++;//if distance b/w two stall is greater than mid then yes cow can sit,so increase cow
              pos = stall[i];//update the new position of stall
            }
            if(cow == noc){//if Curr_cow == no._of_cow 
                return true;//return true
            }
        }
        return false;//else return false, that cow can't sit
    }
}