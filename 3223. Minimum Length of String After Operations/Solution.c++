class Solution {
public:
    int minimumLength(string s) {
        vector<int> charFreq(26,0);
        int total=0;
        for(char curr:s){
            charFreq[curr-'a']++;
        }
        for (int freq:charFreq){
            if(freq==0)continue;
            if(freq%2==0)total+=2;
            else total+=1;
        }
        return total;
    }
};