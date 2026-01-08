class Main{
    public static void main(String[] args){
     int m = 3;//row
     int n = 3;//col
     Path(0,0,m-1,n-1,"");
    } 
// er - endrow, ec = end col , cr = current row, cc = current col
    public static void Path(int cr,int cc,int er,int ec,String ans){
        if(cr== er && cc == ec){
            System.out.println(ans);
            return;
        }
        if(cr>er || cc>ec){
            return;
        }
        Path(cr+1,cc,er,ec,ans+"V");
        Path(cr,cc+1,er,ec,ans+"H");
    }
}