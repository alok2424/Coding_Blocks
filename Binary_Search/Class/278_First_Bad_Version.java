 class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        int ans= 0;
        while(low<=high){
            int mid = low + (high-low)/2;// interview question
            if(isBadVersion(mid)==true){// isBadVersion == Math.pow
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}