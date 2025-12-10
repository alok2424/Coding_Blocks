//How many question

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array");
        int N = sc.nextInt();
        int[][] arr= new int[N][3];
        for(int i = 0; i < N; i++){
           for(int j = 0; j < 3; j++){
             arr[i][j] = sc.nextInt();
            } 
        }

        //for every array
        int ans = 0;
        for(int i = 0;i<N;i++){
            int count_1=0;
           for(int j = 0;j<3;j++){
            if(arr[i][j]==1){
                count_1++;
            }
           }
           if(count_1>=2){
            ans++;
           }
        }
        System.out.print(ans);
    }
}