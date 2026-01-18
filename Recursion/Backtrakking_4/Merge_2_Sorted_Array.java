class Main{
    public static void main(String[] args){
        int[] arr1 = {};
        int[] arr2 = {};
    }
    public static int[] Merge(int[] arr1,int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n+m];
        int i = 0,j = 0, k =0;
        while(i<n && j< m){
            if(arr1[i]<arr2[j]){
                ans[k]= arr1[i];
                i++;
                k++;
            }else{
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while(j<m){
            ans[k] = arr2[i];
            j++;
            k++;
        }
        return ans;
    }
}