class MyHashSet {
public:
    vector<int> ans;
    MyHashSet() {
        
    }
    
    void add(int key) {
        bool contains = false;
        for (int i : ans){
            if(i==key) contains=true;
        }
        if(!contains){
            ans.push_back(key);
        }
    }
    
    void remove(int key) {
        int i = 0;
        while( i < ans.size()){
            if(ans[i] == key){
                ans.erase(ans.begin()+i);
                return;
            }
            i++;
        }
        
    }
    
    bool contains(int key) {
        for (int i : ans){
            if(i==key) return true;
        }
        return false;
    }
};

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet* obj = new MyHashSet();
 * obj->add(key);
 * obj->remove(key);
 * bool param_3 = obj->contains(key);
 */