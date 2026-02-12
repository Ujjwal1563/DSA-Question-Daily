class Solution {
public:
    int minimumBoxes(vector<int>& apple, vector<int>& capacity) {
        int total_apples = accumulate(apple.begin(),apple.end(),0);
        sort(capacity.begin(),capacity.end());
        int sum = 0;
        for (int i = capacity.size() - 1; i >= 0 ;i-- ){
            sum+= capacity[i];
            if(sum >= total_apples){
                return capacity.size() - i;
            }
        }
        return 0;
    }
};