class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int subLen = 0;
        int * hash= new int[255];
        fill(hash,hash+255,-1);
        int l=0;
        int r =0;
        while(r<s.size()){
            if(hash[s[r]]!=-1){
                if(hash[s[r]]>=l){
                    l=hash[s[r]]+1;
                }
            }
            subLen=max(subLen,r-l+1);
            hash[s[r]]=r;
            r++;
        }
        return subLen;
    }
};