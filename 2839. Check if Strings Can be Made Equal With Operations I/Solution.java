class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] arr = s1.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != s2.charAt(i)) {
                char temp = arr[i];
                arr[i] = arr[i + 2];
                arr[i + 2] = temp;
            }
        }
        return new String(arr).equals(s2);
    }
}
