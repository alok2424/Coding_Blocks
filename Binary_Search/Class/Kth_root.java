//kth Root
class Main{
    public static int Kth_Root(int n , int k) {
        int low = 0;
        int high =n;
        int ans = 0;
        while(low<=high){
          int mid = (low+high)/2;
          if(Math.pow(mid,k)<=n){
            ans = mid;
            low = mid+1;//maximum value
          }else{
            high = mid-1;
          }
        }
        return ans;
    }
}