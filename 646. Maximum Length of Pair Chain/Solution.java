class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,Comparator.comparingInt(o->o[1]));
        int lastTime=pairs[0][1];
        int chain=1;
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>lastTime){
                lastTime=pairs[i][1];
                chain++;
            }
        }
        return chain;
    }
}