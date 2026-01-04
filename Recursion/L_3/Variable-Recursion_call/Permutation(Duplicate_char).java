class Permutation2{
    public static void main(String[] args){
        String str = "abcbhjaijai";
        char ch = 'a';
        int i = 2;
        System.out.println(is_Present(str, ch, i));
    }
    public static void Print(String ques,String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i =0; i< ques.length(); i++){
            char ch = ques.charAt(i);
            if(!is_Present(ques, ch, i+1)){
            String s1 = ques.substring(0,i);
            String s2 = ques.substring(i+1);
            Print(s1+s2, ans+ch);
            }
        }
    }
    public static boolean is_Present(String str,char ch, int idx){
        for(int i = idx; i<str.length(); i++){
            if(str.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }
}