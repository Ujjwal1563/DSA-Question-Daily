class Fancy {

    List<Long> array;
    long MOD = 1000000007;

    public Fancy() {
        array = new ArrayList<>();
    }

    public void append(int val) {
        array.add((long) val);
    }

    public void addAll(int inc) {
        for (int i = 0; i < array.size(); i++) {
            array.set(i, array.get(i) + inc);
        }
    }

    public void multAll(int m) {
        for (int i = 0; i < array.size(); i++) {
            array.set(i, (array.get(i) * m) % MOD);
        }
    }

    public int getIndex(int idx) {
        int n = array.size();
        if (idx > n - 1) return -1;
        return (int) (array.get(idx) % MOD);
    }
}
