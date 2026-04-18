class Solution {
    public int reverse(int n){
        int sum =0;
        while(n>0){
            sum = sum*10 + n%10;
            n/=10;
        }
        return sum;
    }
    public int mirrorDistance(int n) {
        int n1 = reverse(n);
        return Math.abs(n- n1);
    }
}