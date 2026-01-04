class Main{
    public static void main(String[] args){
      int n = 4;
      print(n,0,"");
    }
    public static int print(int n, int curr,String ans){
           if(curr == n){
            System.out.println(ans);
            return 1;
           }
           if(curr > n){
            return 0;
           }
           int f = 0;
         for(int dice =1 ; dice<= 3; dice++){
           f = f+  print(n,curr+dice,ans+dice);
         }
         return f;
          // print(n,curr+1,ans+1);
         //  print(n,curr+2,ans+2);
         //  print(n,curr+3,ans+3);
    }
}