class Solution {
public:
    int ways(int n, int arr[]){
        if(n<0) return 0;
        if(n==0)return 1;
        if(arr[n]!=0){
            return arr[n];
        }
        arr[n]= ways(n-1,arr)+ways(n-2,arr);
        return arr[n];
    }
    int climbStairs(int n) {
        int * arr = new int[n+1];
        for (int i=0;i<=n;i++){
            arr[i]=0;
        }
        int ans = ways(n,arr);
        return ans ;   
    }
};