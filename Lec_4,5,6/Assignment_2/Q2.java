import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the num ");
        int num = sc.nextInt();
         System.out.println("enter the digit ");
        int digit = sc.nextInt();
         int count=0;
       
        while(num>0){
            int last_digit = num % 10;
            if(last_digit == digit){
                count++;
            }
            num = num/10;
        }
       System.out.println("COunt of digit " + count);
        
    }
}
