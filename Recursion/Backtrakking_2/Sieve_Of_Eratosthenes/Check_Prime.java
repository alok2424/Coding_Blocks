class Check_Prime{
    
    public static boolean isPrime(int n){
        int div = 2;
        while(div * div <= n){
            if(n % div == 0){
                return false;
            }
            div++;
        }
        return true;
    }
}