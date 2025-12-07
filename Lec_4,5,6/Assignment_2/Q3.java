//Reverse Num
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the num ");
        int num = sc.nextInt();
        int rev = 0;
         while(num>0){
            int rem = num % 10;
             rev = rev * 10 + rem;
             num = num /10;
         }
       System.out.println("Reverse of num " + rev); 
    }
}
