class Solution {
    public String makeLargestSpecial(String s) {
        List<String> specials = new ArrayList<>();
        int start = 0;
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += (s.charAt(i) == '1') ? 1 : -1;

            if (sum == 0) {
                String inner = s.substring(start + 1, i);
                String processed = "1" + makeLargestSpecial(inner) + "0";
                specials.add(processed);

                start = i + 1;
            }
        }
        Collections.sort(specials, Collections.reverseOrder());
        StringBuilder result = new StringBuilder();
        for (String str : specials) {
            result.append(str);
        }

        return result.toString();
    }
}
