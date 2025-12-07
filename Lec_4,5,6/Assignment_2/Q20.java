//shopping game
import java.util.*;
 class ShoppingGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();

        while(val>0){
            int a=0;
            int h=0;
            int phone=1;
            int m=sc.nextInt();
            int n=sc.nextInt();
            while (true){
                a+=phone;
                if(a>m){
                    System.out.println("Harshit");
                    break;
                }
                phone++;
                h=h+phone;
                if(h>n){
                    System.out.println("Aayush");
                    break;
                }
                phone++;
            }

            val--;
        }

    }
}