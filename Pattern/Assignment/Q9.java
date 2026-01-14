//Pattern Triangle
class Main {
    public static void main(String[] args) {
       int n = 4;
       int row = 1;
       int num = 1;
       int space = n-1;
       while(row <= n){
         //space
         int j = 1;
         while(j <= space){
             System.out.print("  ");
             j++;
         }
         //num
         int i = num;
         while(i <= 2*row-1){
             System.out.print(i+" ");
             i++;
         }
         //vertical mirror
         int k = 2*row-2;
         while(k >= num){
             System.out.print(k+" ");
             k--;
         }  
         //next page
         num++;
         space--;
         row++;
         System.out.println();
        }  
     }
}