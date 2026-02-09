class Solution{

    public static void main(String[] args){
      char[][] matrix = ;
     int ans = 0;
      int[] arr = new int[matrix[0].length];
      for(int i =0; i<matrix.length;i++){
                 for(int j = 0;j <matrix[0].length; j++){
                    if(matrix[i][j] == '0'){
                        arr[j] = 0;
                    }else{
                        arr[j]++;
                    }
                 }
                 ans = Math.max(ans,Histogram(arr));
     }
     System.out.println(ans);
    }
}