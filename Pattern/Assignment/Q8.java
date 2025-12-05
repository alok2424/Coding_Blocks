//PAttern hour Glass
class Main {
    public static void main(String[] args) {
       int n = 5;
       int row = 1;
       int num = n;
       int space = 0;

       while(row <= 2*n+1){
          //space
         int j = 1;
         while(j<=space){
             System.out.print("  ");
             j++;
         }
         //num
         int i = num;
         while(i>=0){
             System.out.print(i+" ");
             i--;
         }
         
         //vertical mirror
         int k = 1;
    //     if(row==n+1){
    //         k = 1;
    //    }
         while(k<=num){
             System.out.print(k+" ");
             k++;
         }
         //mirror
         if(row<=n){
         num--;
         space++;
         }else{
             num++;
             space--;
         }
         //next page
         row++;
         System.out.println();
        }  
     }
}