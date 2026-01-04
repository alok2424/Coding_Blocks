class Main{
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int n = 3;
        String ans = "";
        coinToss(n,ans);
    }
     public static int coinToss(int n, String ans){
        if(n == 0){
            System.out.println(ans);
            return 1;
        }
        int f = coinToss(n-1, ans+"H");//left recursion call
        int s = coinToss(n-1, ans+"T");//right recursion call
        return f+s;
      }
}