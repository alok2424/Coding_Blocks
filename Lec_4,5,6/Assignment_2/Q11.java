//Replace them all
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num: ");
        int N = sc.nextInt();
        String s = String.valueOf(N);
        s = s.replace('0','5');
        N = Integer.parseInt(s);
        System.out.println(N);
    }
}