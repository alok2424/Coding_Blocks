class Main{
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int n = 3;
        String ans = "";
        coinToss(n,ans);
    }
     public static void coinToss(int n, String ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }
        coinToss(n-1, ans+"H");//first blank
        coinToss(n-1, ans+"T");
      }
}