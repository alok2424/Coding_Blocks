//Pattern Inverted Hour Glass
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       int n = 5;
       int row = 1;
       int num = n;
       int space = 2*n-1;

       while(row <= 2*n+1){
         //num
         int i = n;
         while(i>=num){
             System.out.print(i+" ");
             i--;
         }
         //space
         int j = 1;
        
         while(j<=space){
             System.out.print("  ");
             j++;
         }
         //num
         int k = num;
         if(row==n+1){
             k = 1;
         }
         while(k<=n){
             System.out.print(k+" ");
             k++;
         }
         //mirror
         if(row<=n){
         num--;
         space-=2;
         }else{
             num++;
             space+=2;
         }
         //next page
         row++;
         System.out.println();
        }  
     }
}