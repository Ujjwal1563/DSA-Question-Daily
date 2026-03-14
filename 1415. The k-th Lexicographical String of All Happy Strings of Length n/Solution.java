class Solution {

    public void solve(List<String> ans, StringBuilder curr, int n, int k, char[] v) {
        if (ans.size() == k) return;

        if (curr.length() == n) {
            ans.add(curr.toString());
            return;
        }

        for (int i = 0; i < 3; i++) {
            if (curr.length() == 0 || curr.charAt(curr.length() - 1) != v[i]) {
                curr.append(v[i]);
                solve(ans, curr, n, k, v);
                curr.deleteCharAt(curr.length() - 1);
            }
        }
    }

    public String getHappyString(int n, int k) {
        StringBuilder curr = new StringBuilder();
        List<String> ans = new ArrayList<>();
        char[] v = {'a', 'b', 'c'};

        solve(ans, curr, n, k, v);

        if (ans.size() == k) {
            return ans.get(ans.size() - 1);
        } else {
            return "";
        }
    }
}
