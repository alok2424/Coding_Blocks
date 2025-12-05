//Pattern Rhombus-
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       int n = 3;
       int row = 1;
       int num = 1;
       int space = n-1;

       while(row <= 2*n-1){
          //space
         int j = 1;
         while(j <= space){
             System.out.print("  ");
             j++;
         }
         //num
         int i = num;
         while(i <= 2*row-1){//mistake_1
             System.out.print(i+" ");
             i++;
         }
         //vertical mirror
         int k = 2*row-2;//mistake_2
         if(row > n){
             k = num;
         }
         while(k >= num){
             System.out.print(k+" ");
             k--;
         }
         //horixontal mirror
         if(row < n){
         num++;
         space--;
         }else{
             num--;
             space++;
         }
         //next page
         row++;
         System.out.println();
        }  
     }
}