//how many paratha , that can be cooked in mid minutes

import java.util.*;
class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
       int P = sc.nextInt();//no of paratha
       int L = sc.nextInt();//no of cook
       int[] R = new int[L];
       for(int i = 0; i< L;i++){
         R[i] = sc.nextInt();//rank of cook
       }

       int max_rank = R[R.length-1];

       int ans = 0;
       //search space
       int low = 1;
       int high = max_rank * P * (P + 1)/2 ;

       while(low<high){
           int mid = (low + high)/2;
           int curr_paratha = 0;
           //how to calculate no. of paratha made in given time
           for(int i = 1; i<L; i++){
               curr_paratha = R[i]*P*(P+1)/2;
           }
           //Relation between ans and paratha ka calculation
            
           //conditions
           if(curr_paratha > P){
               high = mid-1;
           }else if(curr_paratha < P){
                low = mid+1;
           }else{
               ans = mid;
           }
       }
       System.out.println(ans);
    }
}