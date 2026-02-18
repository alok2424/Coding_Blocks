
import java.util.LinkedList;

class Stack_Using_Queue{
    private Queue<Integer> q;

    public Stack(){
        q = new LinkedList();
    }
    //O(1)
    public void push(int item){
        q.add(item);//Enqueue Method
    }
    //O(n)
    public int pop(){
        //remove dequeue
        Queue<Integer> helper = new LinkedList<>();

        while(q.size()>1){
            helper.add(q.remove());
        }
        int x = (int) q.poll();//remove first
        while(helper.size()>0){
            q.add((helper.remove()));
        }
        return x;
    }
    //O(n)
    public int peek(){
        //remove dequeue
        Queue<Integer> helper = new LinkedList<>();
        
        while(q.size()>1){
            helper.add(q.remove());
        }
        int x = (int) q.poll();//remove first
        while(helper.size()>0){
            q.add((helper.remove()));
        }
        q.add(x);
        return x;
    }

}