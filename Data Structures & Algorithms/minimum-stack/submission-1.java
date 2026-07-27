class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();
    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minstack.isEmpty() || val <= minstack.peek()) {
            minstack.push(val);
        }
    }

    public void pop() {
        int pop = stack.pop();
        if(pop == minstack.peek()){
            minstack.pop();
        }
    }

    public int top() {
        int peek = stack.peek();
        return peek;
    }

    public int getMin() {
        int minvalue = minstack.peek();
        return minvalue;
    }
}
