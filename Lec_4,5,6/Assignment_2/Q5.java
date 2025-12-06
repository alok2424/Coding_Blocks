//Nth_Fiboncci num
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the num: ");
        int N = sc.nextInt();
        int a = 0;
        int b = 1;
        int i = 1;
        while(i<N){
           int c = a+b;
            a =b;
            b = c;
            i++;
        }
        System.out.print("Nth Fibonacci Num " + b);
    }
}