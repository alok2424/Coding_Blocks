//Inverse of a num
import java.util.*;
class Inverse_of_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=0;
        int i=1;
        while (n > 0) {
                int rem=n%10;
                int place=rem-1;

                num= (int) (num+i*Math.pow(10,place));
                n=n/10;
            i++;
        }
        System.out.println(num);

    }
}
