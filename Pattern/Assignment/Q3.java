//PAttern with zero
class main {
    public static void main(String[] args) {
		int n = 5;// input
		int row = 1;
		int num = 1;
		int zero = 0;
		while (row <= n) {
	         int i = 1;
	         while(i<=num){
	         if(row == 1){
	             System.out.print(num+"\t");
	         }
	         else{
	             if(i ==1 || i==num){
		             System.out.print(num+"\t");
		         } else{
		             System.out.print("0\t");
		         }
	         }
		       i++;  
		     }
		      //next line ki prep
		    num++;
			System.out.println();
			row++;
        }
    }
}