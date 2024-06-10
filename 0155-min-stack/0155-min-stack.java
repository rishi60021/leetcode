class MinStack {
    Stack<Long> ans=new Stack<>();
    long min;

    public MinStack() {
        min=Long.MAX_VALUE;
        
    }
    
    public void push(int val) {

        if(ans.isEmpty()){
            ans.push((long)val);
            min=val;
        }
        else if(val<min){
            ans.push(2*(long)val-min);
            min=val;

        }else{
ans.push((long)val);
        }
        
        
    }
    
    public void pop() {
        if(ans.isEmpty()){
            return;
        }
        long t=ans.pop();
        if(t<min){
            min=2*min-t;
        }
        
    }
    
    public int top() {
        long t=ans.peek();
        if(t<min){
            return (int) min;
        }
        return (int)  t;

        
    }
    
    public int getMin() {
        return (int) min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */