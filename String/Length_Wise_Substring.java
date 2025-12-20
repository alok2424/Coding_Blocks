//Length Wise Substring
class Main{
public static void Substring(String s){
    for(int len = 1; len<= s.length();len++){
        for(int j = len; j<= s.length();j++){
           int i = j - len;
           System.out.println(s.substring(i,j));
        }
    }
}
}
