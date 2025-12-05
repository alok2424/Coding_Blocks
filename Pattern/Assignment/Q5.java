//PAttern Mountain
    class main {
        public static void main(String[] args) {
    	     int n=4;
    	     int row = 1;
    	     int num = 1;
    	     int space = 2*n-3;
    	    
    	     while( row <= n ){ 
                int i = 1;
                while(i <= row){
                    System.out.print(i+"\t");
                    i++;
                }
                //space
                int j = 1;
                while(j <= space){
                    System.out.print("\t");
                    j++;
                }
                //num
                int k = row;
                if(row == n){
                    k =row-1;
                }
                while(k >= 1){
                    System.out.print(k+"\t");
                    k--;
                }
                
                
                //next line
                num++;
                space-=2;
                row++;
                System.out.println();
    	     }
        }
    }