//PAttern_Double_Sided_arrow

class Main {
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        int num = 1;
        int space1 = 2*(n-row);
        int space2 = -1;
        while (row <= 2*n-1) {
            //space
            int  j = 1;
            while(j<space1){
                System.out.print("  ");
                j++;
            }
            //num
            int i = num;
            while(i>=1){
                System.out.print(i+" ");
                i--;
            }
            //space_2
            int l = 0;
            while(l<space2){
                System.out.print("  ");
                l++;
            }
            //vertical mirror
            int k = 1;
            if(row == 1 || row == 2*n-1){
                k = 2;
            }
            while(k<= num){
                System.out.print(k+" ");
                k++;
            }
            //horizontal mirror
            if(row < n){
                space1-=2;
                num++;
                space2+=2;
            }else{
                space1+=2;
                num--;
                space2-=2;
            }
            //next page
            System.out.println();
            row++;
            
        }
    }
}
