class Permutation{
    public static void main(String[] args){
        String str = "abc";
        Print(str,"");
    }
    public static void Print(String ques,String ans){
        if(ques.length() == 0){
            System.out.print(ans);
            return;
        }
        for(int i =0; i< ques.length(); i++){
            char ch = ques.charAt(i);
            String s1 = ques.substring(0,i);
            String s2 = ques.substring(i+1);
            Print(s1+s2, ans+ch);
        }
    }
}