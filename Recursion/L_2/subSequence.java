class Main{
    public static void main(String[] args){
     String s= "abc";
     subSequence(s, "");
    } 
    public static void subSequence(String s, String ans){
        //base condition
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        //left recursion call
        subSequence(s.substring(1), ans);//first blank
        //right recrusion call
        subSequence(s.substring(1), ans+ch);
      }
}