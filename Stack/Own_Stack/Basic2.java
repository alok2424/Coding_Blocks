class Stack{
    private int[] arr;
    private int idx= -1;

    // public Stack(){    //redundancy
    //    arr = new int[5];
    // }
    public Stack(){  //constructor calling 
       this(5);
    }
    public Stack(int n){
      this.arr = new int[n];
    }

    public boolean isEmpty(){
        return this.idx == -1;
    }
    public boolean isFull(){
        return this.idx == this.arr.length-1;
    }
    public void push(int x) throws Exception{
        if(isFull()){
            throw new Exception("bklol stack full hai");
        }
        arr[++idx] = x;
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Bklol Stack Empty hai");
        }
        return this.arr[this.idx];
    }
    public int size(){
        return idx+1;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Bklol Stack Empty hai");
        }
        return this.arr[this.idx--];
    }

    public void Display(){
        for(int i = 0; i<= idx; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}