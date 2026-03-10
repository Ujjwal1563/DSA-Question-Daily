class MyQueue {

    Stack<Integer> st1;
    Stack<Integer> st2;

    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    private void moveS1toS2() {
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
    }

    public void push(int x) {
        st1.push(x);
    }

    public int pop() {
        moveS1toS2();
        return st2.pop();
    }

    public int peek() {
        moveS1toS2();
        return st2.peek();
    }

    public boolean empty() {
        return st1.isEmpty() && st2.isEmpty();
    }
}
