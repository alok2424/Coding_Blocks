// class Solution {
//     public int beautySum(String s) {
        
//     }
//     public static int substring(String s){
//       //how to calculate freq_for_each_unique_character
//       int[] freq = new int[26];
//       for(int i = 0; i<s.length;i++){
//          char ch = s.charAt(i);
//          freq[ch-97]++;
//       }
//       int min_char= 0;
//       int max_char = 0;
//       int  ans = 0;
//       for(int x:freq){
//         min_char = Math. min(min_char,x);
//         max_char = Math.min(max_char,x);
//       }
//       for(int i = 0; i<s.length;i++){
//         ans+= max_char-min_char;
//       }
//     }
// }


class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int [] freq=new int [26];
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                freq[ch-'a']++;
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                        min=Math.min(min,freq[k]);
                        max=Math.max(max,freq[k]);
                    }
                }
                ans+=max-min;
            }
        }
        return ans;
    }
}