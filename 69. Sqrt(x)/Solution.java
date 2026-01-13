class Solution {
    public int mySqrt(int x) {
        if(x<2)return x;
        int left = 1;
        int right = x/2;
        while(left <= right ){
            int mid = left + (right - left)/2;
            long product = (long) mid * mid;
            if(product < x){
                left = mid + 1;
            }
            else if ( product > x){
                right = mid - 1;
            }
            else {
                return mid;
            }
        }
        return right;
    }
}