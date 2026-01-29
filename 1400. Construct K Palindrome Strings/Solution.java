class Solution {
    public boolean canConstruct(String s, int k) {
       if (s.length() < k ) return false ;
       int oddcount = 0 ;
       char [] ch = s.toCharArray();
       Arrays.sort(ch);
       for(int i =0 ;i < ch.length ;){
        char c = ch[i];
        int count = 0;
        while (i< ch.length && ch[i] == c){
            i++;
            count ++;
        }
        if(count %2 !=0) oddcount++;
       }  
    return oddcount<=k;
    }
}