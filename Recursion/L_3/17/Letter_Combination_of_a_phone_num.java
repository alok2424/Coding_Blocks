import java.util.*;
class Solution{
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String ques) {
        List<String> ll = new ArrayList<>();
        KeyPad(ques,"",ll);
        return ll;
    }
    public static void KeyPad(String  ques,String ans,List<String> ll){
        if(ques.length() == 0){
         //System.out.println(ans);
            ll.add(ans);
            return; 
        }
        char ch = ques.charAt(0);//'2'
         //String get = key[ch];//it gives ASCII value
        String get = key[ch-'0'];//abc
        for(int i =0; i<get.length();i++){
            KeyPad(ques.substring(1), ans+get.charAt(i),ll);
        }
    }
}