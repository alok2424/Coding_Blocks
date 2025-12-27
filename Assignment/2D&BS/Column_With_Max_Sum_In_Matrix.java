import java.util.*;
 class Main {
    public static void main (String args[]) {
     Scanner sc= new Scanner(System.in);
     int N = sc.nextInt();//enter the size of matrix
     int[][] matrix = new int[N][N];//declare the new matrix
      
      //Enter the elements of matrix
     for(int i = 0; i< N;i++){
         for(int j= 0; j<N; j++){
             matrix[i][j] = sc.nextInt();
         }
     }
     int ans = 0;
     int index_of_column = -1;
     for(int i = 0; i< N;i++){
         int sum = 0;
         for(int j = 0; j<N;j++){
             sum+= matrix[i][j];
             ans = Math.max(sum,ans);
         } 
         index_of_column = i+1;
     }
     System.out.print(index_of_column+ " " + ans);
    }
}