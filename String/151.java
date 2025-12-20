class Main{
    public static void reverse_word_in_String(){
        String s = " the sky is blue";
        s = s.trim();
        String[] arr = s.split(" +");
        String ans= "";//blank string
        for(int i = arr.length-1; i>0;i--){
            ans  += arr[i] + " ";
        }
        ans  = ans.trim();
        System.out.println(ans);
    }
}