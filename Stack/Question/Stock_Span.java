class StockSpan{
     public static voidspan(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i = 0; i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
              st.pop();
           }
           //cal span
           if(st.isEmpty()){
            ans[i] = i+1
              }else {
                ans[i] = i- st.peek();
              }
           st.push(i);
         }
         
   }
}