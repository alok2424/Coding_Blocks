//count
class Main{
    public static void main(String[] args){
     String s= "abc";
     subSequence(s, "");
     System.out.println("\n"+c);
    } 

    static int c = 0;
    public static void subSequence(String ques, String ans){
        //base condition
        if(ques.length() == 0){
            System.out.println(ans);
            c++;
            return;
        }
        char ch = ques.charAt(0);
        subSequence(ques.substring(1), ans);//first blank
        subSequence(ques.substring(1), ans+ch);
      }
}