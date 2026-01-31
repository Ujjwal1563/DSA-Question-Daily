class Solution {
public:
    string reversePrefix(string word, char ch) {
        int index = word.find(ch);
        if(!index)return word;
        else {
            reverse(word.begin(),word.begin()+index+1);
            return word;
        }
    }
};