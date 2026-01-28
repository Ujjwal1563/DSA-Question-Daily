class Solution {
    public int minimumLength(String s) {
        int [] charFreq = new int [26];
        for (char c : s.toCharArray()){
            charFreq[c-'a']++;
        }
        int total = 0;
        for (int freq : charFreq){
            if(freq == 0) continue;
            if(freq % 2 == 0) total += 2;
            else total += 1;
        }
        return total;
    }
}