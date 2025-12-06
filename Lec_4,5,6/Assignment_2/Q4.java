//check prime
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the num: ");
        int N = sc.nextInt();
        int i = 2;
        int fact = 0;
        while(i<N){
        if(N % i == 0){
          fact++;
        }
         i++;
       }
       if(fact >= 1){
        System.out.println("NOT prime");
       }else{
        System.out.println("prime");
       }
    }
}