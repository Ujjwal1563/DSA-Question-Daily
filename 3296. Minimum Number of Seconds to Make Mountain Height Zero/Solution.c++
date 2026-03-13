class Solution {
public:
    long long minNumberOfSeconds(int mountainHeight, vector<int>& workerTimes) {
        priority_queue<vector<long long>, vector<vector<long long>>, greater<vector<long long>>>pq;
        for(auto it : workerTimes){
            pq.push({it, it, 1});
        }
        long long ans = 0, curr = mountainHeight;
        while(!pq.empty()){
            auto it = pq.top();
            pq.pop();
            long long maxTime = it[0];
            long long baseTime = it[1];
            long long reduced = it[2];
            ans = max(ans, maxTime);
            curr--;
            if(curr ==0) break;
            long long nextHeight = reduced + 1;
            long long total = (baseTime * (nextHeight) * (nextHeight + 1))/2;
            pq.push({total, baseTime, nextHeight});
        }
        return ans;
    }
};