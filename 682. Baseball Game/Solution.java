class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C"))st.pop();
            else if(operations[i].equals("D")){
                int pro = st.peek()*2;
                st.push(pro);
            }
            else if(operations[i].equals("+")){
                int topElement= st.pop();
                int sum = topElement+st.peek();
                st.push(topElement);
                st.push(sum);
            }
            else {
                String s=operations[i];
                st.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        for(Integer i:st){
            sum+=i;
        }
        return sum;
    }
}