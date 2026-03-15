class Fancy {
public:
    vector<long long >array;
    Fancy() {
        
    }
    
    void append(int val) {
       array.push_back(val); 
    }
    
    void addAll(int inc) {
        for (int i = 0; i< array.size();i++){
            array[i] = array[i]+inc;
        }
    }
    
    void multAll(int m) {
        for (int i = 0; i< array.size();i++){
            array[i] = (array[i]*m)%1000000007;
        }
    }
    
    int getIndex(int idx) {
        int n =  array.size();
        if(idx > n -1) return -1;
        return array[idx] % 1000000007;
    }
};

/**
 * Your Fancy object will be instantiated and called as such:
 * Fancy* obj = new Fancy();
 * obj->append(val);
 * obj->addAll(inc);
 * obj->multAll(m);
 * int param_4 = obj->getIndex(idx);
 */