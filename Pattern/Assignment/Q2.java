// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
		int n = 5;// input
		int row = 1;
		int star = 1;
		int space =  n/2;
		while (row <= n) {
		    	// space
		    int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
		    //star
		    int i = 1;
		    while(i<=star){
		        System.out.print("* ");
		        i++;
		    }
	
			//mirror
			if(row < (n+1)/2){
			  space--;
			  star += 2;
			}else{
			  star -= 2;
			  space++;
			}
			
			// next line ki prep
			System.out.println();
			row++;
 }
    }
}