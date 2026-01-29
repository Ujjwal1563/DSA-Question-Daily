class Solution {
    public long minimumSteps(String s) {
        long  res  = 0;
        long swap = 0;
        char []ch = s.toCharArray();
        for (int i = 0;i <  ch.length;i++){
            if(ch[i]=='0'){
                res+=swap; 
            }
            else {
                swap++;
            }
        }
        return res; 
    }
}