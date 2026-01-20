class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (String str : details) {
            String sub = str.substring(11, 13);
            int number = Integer.parseInt(sub);
            if (number > 60) {
                count++;
            }
        }
        return count;
    }
}