
class Main{
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int n = 3;
        String ans = "";
        coinToss2(n,ans);
    }
     public static void coinToss2(int n, String ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }
        if(ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H'){
          coinToss2(n-1, ans+"H");//first blank 
        }
        coinToss2(n-1, ans+"T");
      }
}