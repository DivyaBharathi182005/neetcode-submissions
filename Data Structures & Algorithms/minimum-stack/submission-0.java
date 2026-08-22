class MinStack {
    Stack<Integer> s;
    Stack<Integer> m;

    public MinStack() {
        s=new Stack<>();
        m=new Stack<>();

        
    }
    
    public void push(int val) {
        s.push(val);
        if(m.isEmpty()||val<=m.peek())
        {
            m.push(val);
        }
        
    }
    
    public void pop() {
        int rem=s.pop();
        if(rem==m.peek())
        {
            m.pop();
        }
        
    }
    
    public int top() {
        
        return s.peek();
    }
    
    public int getMin() {
        return m.peek();
        
    }
}
