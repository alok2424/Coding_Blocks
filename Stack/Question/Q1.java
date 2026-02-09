//push element at the bottom
import java.util.*;
class Stack{
    public static void main(String[] args){
        Stack<Integer> st= new Stack<>();
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