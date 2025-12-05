//Pattern Magic
    class main {
        public static void main(String[] args) {
    	     int n=5;
    	     int row = 1;
    	     int star = n;
    	     int space = -1;
    	    
    	     while( row <= 2*n-1 ){ 
    	         
    	        //star
                int i = 1;
                while(i <= star){
                    System.out.print("*\t");
                    i++;
                }
                
                //space
                int j = 1;
                while(j <= space){
                    System.out.print("\t");
                    j++;
                }
                
                //num
                int k = 1;
                if(row == 1 || row == 2*n-1){
                    k = 2;
                }
                while(k <= star){
                    System.out.print("*\t");
                    k++;
                }
                
                //mirror
                if(row<n){
                    star-=1;
                    space+=2;
                }else{
                    star+=1;
                    space-=2;
                }
                //next line
                
                row++;
                System.out.println();
    	     }
        }
    }