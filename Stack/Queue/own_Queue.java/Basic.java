class Queue{
    private int[] arr;
    private int front = 0;
    private int size = 0;//rear and no. of elements count
 
   public Queue(){

   }
   public Queue(int n){
    arr = new int[n];
   }
   public boolean isEmpty(){
    return size == 0;
   }
   public boolean isFull(){
    return size == arr.length;
   }
   public int size(){
    return size;
   }
   public void Enqueue(int x) throws Exception{
    if(isFull()){
        throw new Exception("Bklol Queue full hai");
    }
    int idx = front+size;
    arr[idx] = x;
    size++;
   }
    public void Dequeue(int x) throws Exception{
    if(isEmpty()){
        throw new Exception("Bklol Queue empty hai");
    }
    int x =  arr[front];
    front++;
    size--;
    return x;
   }
   

}