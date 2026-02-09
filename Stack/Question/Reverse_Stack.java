//recursion + Add_Last 
//TC: O(n^2)
import java.util.*;
class Reverse_Stack{
    public static void main(String[] args) {
     Stack<Integer> st = new Stack<>();
     st.push(10);
     st.push(20);   
    }
    private static void Reverse_Stack(Stack<Integer> st,int item){
        if(st.isEmpty()){
            st.push(item);
            return;
        }
        int x = st.pop();
        Add_last(st,item);
        st.push(x);
    }
    public static void Add_last(Stack<Integer> st,int item){
    if(st.isEmpty()){
        st.push(item);
        return;
    }
    int x = st.pop();
    Add_last(st, item);
    st.push(x);
   }
}