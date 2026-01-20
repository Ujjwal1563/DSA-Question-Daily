class Solution {
public:
    int countSeniors(vector<string>& details) {
        int count = 0;
        for (auto str : details) {
            string sub = str.substr(11, 2);
            int number = stoi(sub);
            if (number > 60) {
                count++;
            }
        }
        return count;
    }
};