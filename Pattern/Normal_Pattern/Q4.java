//PAttern with Ladder
class main {
    public static void main(String[] args) {
	     int n=5;
	     int row = 1;
	     int num = 1;
	     
	     while( row<=n ){
            int i = 1;
            while(i <= row){
                System.out.print(num+"\t");
                i++;
                num++;
            }
            //next line
            row++;
            System.out.println();
	     }
    }
}