
class Main{
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int n = 3;
        String ans = "";
        coinToss2(n,ans);
    }
     public static int coinToss2(int n, String ans){
        if(n == 0){
            System.out.println(ans);
            return 1;
        }
        int f = 0;
        //left recursion call
        if(ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H'){
          f= f + coinToss2(n-1, ans+"H");//first blank 
        }
        //right recursion call
        int s = coinToss2(n-1, ans+"T");
        return f+s;
      }
}