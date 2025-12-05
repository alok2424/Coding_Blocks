class Main{
    public static void main(String[] args){
        int n = 278;
        int i =2;
        while(i>1){
            if(n%i == 0 ){
                System.out.println(i);
                //if yes, then reduce the original number
                n = n/i;
            }else{
                i++;
            }
        }
    }
}