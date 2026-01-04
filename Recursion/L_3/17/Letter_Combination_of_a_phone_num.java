class Solution {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public static void main(String[] args){
        String ques = "237";
        KeyPad(ques,"");
    }
    public static void KeyPad(String  ques,String ans){
        char ch = ques.charAt(0);//'2'
    //    String get = key[ch];//it gives ASCII value
        String get = key[ch-'0'];//abc
        for(int i =0; i<get.length();i++){
            KeyPad(ques.substring(1), ans+get.charAt(i));
        }
    }
}