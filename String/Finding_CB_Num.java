class Main{
    public static void subString(String s){
        boolean[] visited = new boolean[s.length()];
        int c =0;
        for(int len =1; len <= s.length(); len++){
            for(int j = len; j<= s.length(); j++){
                int i = j - len;
                long num = Long.parseLong(s.substring(i,j));
                if(isCbNumber(num) && isVisited(visited,i,j-1)){
                    c++;
                    //marked visited
                    for(int k = i;k < j; k++){
                        visited[k] = true;
                    }
                }
            }
        }
        System.out.println(c);
    }
    //non overlapping string
    public static boolean isVisited(boolean[] visited,int si,int ei){
        for(; si<= ei;si++){
            if(visited[si] == true){
                return false;
            }
        }
        return  true;
    }
    public static boolean isCbNumber(long num){
        if(num == 0 || num== 1){
           return false;
        }
        int[] arr = {2,3,5,7,11,13,17,19,23,29};
        for(int i = 0; i< arr.length;i++){
            if(arr[i]== num){
                return  false;
            }
        }
        for(int i = 0; i<arr.length;i++){
            if(num % arr[i] == 0){
                return false;
            }
        }
        return true;
    }
}