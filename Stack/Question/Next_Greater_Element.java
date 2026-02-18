class NextGreater{
    public static void main(String[] args){
      
    }
    public static void NGE(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i = 0; i<arr.length;i++){
            while(!st.isEmpty() && arr[i]> arr[st.peek()]){
                ans[st.pop()] = arr[i];
           }
           st.push(i);
         }
         //for those element hasn't any 
         while(!st.isEmpty()){
            ans[st.pop()] = -1;
         }
         //element print kara rahe hai
         for(int i = 0; i<ans.length;i++){
            System.out.println(arr[i]+" "+ ans[i]);
         }
   }
}