import java.util.*;
class Main{
    public static void main(String[] args){
        String ques = "nitin";
        List<String> ll = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        Partition(ques,ll,ans);
    }
    public static void Partition(String ques,List<String> ll,List<List<String>> ans){
        if(ques.length() == 0){
          //  System.out.println(ans);
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i = 1; i<= ques.length();i++){
            String s= ques.substring(0,i);
            if(isPalindrom(s)){
                ll.add(s);
              Partition(ques.substring(i),ll,ans);
              ll.remove(ll.size()-1);//backtrakking step
            }  
        }
    }
   public static boolean isPalindrom(String s) {
		int i = 0;
		int j = s.length() - 1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}