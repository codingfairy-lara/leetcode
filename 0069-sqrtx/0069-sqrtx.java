class Solution {
    public int mySqrt(int x) {
                if(x<0) return -1;
        int low = 1; int high = x; int res = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(mid<=x/mid){
                res = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return res;

        // return (int) Math.sqrt(x);
       //1 Liner 

    }
}