import java.util.Stack;
class Queue_Using_Stack{
private Stack<Integer> st;

public Queue_Using_Stack(){
    st = new Stack<>();
}
//O(N)
public void Enqueue(int x){
    Stack<Integer> helper = new Stack<>();
    while(st.size() >0){
        helper.push(st.pop());
    }
    st.push(x);
    while(helper.size() > 0){
        st.push(helper.pop());
    }
}
//O(1)
public int Dequeue(){
    return st.pop();
}
//O(1)
public int getFront(){
    return st.peek();
}
}
