class Main{
    public static void main(String[] args){
        int n = 4;
        int tq = 2;
        boolean[] board = new boolean[n];
        Combination(board,tq,0,"",0);
    }
    public static void Combination(boolean[] board,int tq,int qpsf,String ans,int idx){
        if(tq == qpsf){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < board.length; i++){
            if(board[i] == false){
                board[i] =true;
                Combination(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf,i+1);//idx+1 ya i+1
                board[i] = false;//UNDO // backtrakking step
            }
        }
    }
}