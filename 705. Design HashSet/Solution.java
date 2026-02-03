import java.util.ArrayList;
import java.util.List;

class MyHashSet {
    private List<Integer> ans;

    public MyHashSet() {
        ans = new ArrayList<>();
    }
    
    public void add(int key) {
        boolean contains = false;
        for (int val : ans) {
            if (val == key) {
                contains = true;
                break;
            }
        }
        if (!contains) {
            ans.add(key);
        }
    }
    
    public void remove(int key) {
        for (int i = 0; i < ans.size(); i++) {
            if (ans.get(i) == key) {
                ans.remove(i);
                return;
            }
        }
    }
    
    public boolean contains(int key) {
        for (int val : ans) {
            if (val == key) return true;
        }
        return false;
    }
}
