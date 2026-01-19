class Solution {
public:
    int compress(vector<char>& chars) {
        int index=0;
        for(int i =0;i<chars.size();){
            char curr = chars[i];
            int count =0;
            while(i<chars.size() && chars[i]==curr){
                i++;
                count++;
            }
            chars[index]=curr;
            index++;
            if(count>1){
                string num= to_string(count);
                for(char ch : num){
                    chars[index]=ch;
                    index++;
                }
            }
        }
        return index;
    }
};