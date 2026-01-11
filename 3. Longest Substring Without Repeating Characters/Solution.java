class Solution {
    public int lengthOfLongestSubstring(String s) {
        int subLen=0;
        int []hash = new int [255];
        Arrays.fill(hash,-1);
        int l =0;
        int r =0;
        while(r<s.length()){
            if(hash[s.charAt(r)]!=-1){
                if(hash[s.charAt(r)]>=l){
                    l = hash[s.charAt(r)]+1;
                }
            }
            subLen=Math.max(subLen,r-l+1);
            hash[s.charAt(r)]=r;
            r++;
        }
        return subLen;
    }
}