//Sum_of_Odd_Placed_and_Even_Placed_Digits
//mycode
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     
       //declare variable
        int odd_sum = 0;
        int even_sum = 0;
       //how to access even place digit
        while(n > 0){
           int even_digit = (n % 100)/10;
            even_sum+= even_digit;
            System.out.println("even_sum "+even_sum);
            n /= 100;
        }
          
        //how to access odd place digit
          while(n>0){
              int odd_digit = n%100;
             odd_sum += odd_digit;
         System.out.println("odd_sum"+odd_sum);
              n = odd_digit/10;
          }  
          
    }
}