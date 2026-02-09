import java.util.*;
class Main{
    public static void main(String[] args) {
        int[] coin= {2,3,5};
        int amount = 7;
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Combination(coin,amount,ll,0,ans);
        System.out.println(ans);
    }
    
    public static void Combination(int[] coin,int amount,List<Integer> ll,int idx,List<List<Integer>> ans){
        if(amount == 0){
            System.out.println(ll);
           // ans.add(ll);
           ans.add(new ArrayList<>(ll));//why we need to create new arraylist ?
           return;
        }
       for(int i = idx; i< coin.length; i++){
        if(amount >= coin[i]){
              ll.add(coin[i]);
       //     Combination(coin, amount-coin[i],ll.add(coin[i]),i);  //ll.add(coin[i]) not allowed
              Combination(coin, amount-coin[i],ll,i,ans);//ll.add(coin[i]) not allowed,why?
              ll.remove(ll.size()-1);//backtracking step
        }
      }
    }
}
