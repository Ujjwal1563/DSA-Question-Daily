class Solution {
public:
    int reverseInt(int x){
        long long r =0;
        while(x>0){
            r=r*10+(x%10);
            x/=10;
        }
        return (int)r;
    }
    int minMirrorPairDistance(vector<int>& nums) {
        vector<int>mirror=nums;
        unordered_map<int,int>idx;
        int ans = INT_MAX;
        for (int i =0;i<mirror.size();i++){
            int curr = mirror[i];
            int rev = reverseInt(curr);
            if(idx.count(curr)){
                ans=min(ans,abs(i-idx[curr]));
            }
            idx[rev]=i;
        }
        return (ans==INT_MAX?-1 :ans);
    }
};