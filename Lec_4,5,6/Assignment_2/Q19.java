//Chewbacca
import java.util.*;
class Chewbacca{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long newNo=0;
        long val=1;
        while (n>9) {
            long rem = n % 10;
            //if first digit is greater than 5
            if(rem>=5){
                rem=9-rem;
            }
            newNo=newNo+rem*val;
            val=val*10;
            n=n/10;
        }
        //special case
        if(n==9||n<5){
            newNo=newNo+n*val;
        }
        else {
            newNo=newNo+(9-n)*val;
        } 
        System.out.println(newNo);
    }
}