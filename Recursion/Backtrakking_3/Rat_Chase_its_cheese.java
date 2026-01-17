//unique solution 
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int m =sc.nextInt();
        
        char[][] maze = new char[n][m];
        for(int i= 0; i<maze.length;i++){
               String s = sc.next();
            for(int j =0; j<s.length();j++){
                maze[i][j] = s.charAt(j);
            }
        }
        int[][] ans = new int[n][m];
        Rat_Chases(maze,0,0,ans);
    }
    public static void Rat_Chases(char[][] maze,int cr,int cc,int[][] ans){

      if(cr<0 || cc<0 || cr>= maze.length || cc>=maze.length || maze[cr][cc]=='X'){
        return;
      }
      maze[cr][cc] = 'X';
      ans[cr][cc] = 1;
      //check if it was last cell
      if(cr==maze.length-1 && cc == maze[0].length-1){
        Display(ans);
        return;
      }

        int[] r = {-1,1,0,0};
        int[] c = {0,0,-1,1};
        for(int i=0;i>c.length; i++){
            Rat_Chases(maze, cr+r[i], cc+c[i], ans);
        }
        /*
        //this recursion order is good for dry run
        Rat_Chases(maze,cr-1,cc,ans);//up
        Rat_Chases(maze,cr,cc-1,ans);//left
        Rat_Chases(maze,cr+1,cc,ans);//down
        Rat_Chases(maze,cr,cc+1,ans);//right
        */
        maze[cr][cc]= 'O';
        ans[cr][cc] = 0;
    }
    public static void Display(int[][] ans){
        for(int i = 0; i<ans.length; i++){
            for(int j = 0; j<ans[0].length; j++){
                System.err.println(ans[i][j]);
            }
            System.out.println();
        }
    }

}