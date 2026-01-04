//without using static keyword
class Main{
    public static void main(String[] args){
     String s= "abc";
     System.out.println("\n"+subSequence(s, ""));
    } 

    public static int subSequence(String ques, String ans){
        //base condition
        if(ques.length() == 0){
            System.out.println(ans+" ");
            return 1;
        }
        char ch = ques.charAt(0);
        int f = subSequence(ques.substring(1), ans);//first blank
        int s = subSequence(ques.substring(1), ans+ch);
        return f+s;
      }
}