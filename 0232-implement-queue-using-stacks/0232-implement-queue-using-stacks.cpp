class MyQueue {
public:
    // we can use two stacks
    // and as soon as we go to pop operation we push all the content from stack1 to stack2
    // and then pop from stack2
    stack<int> st1, st2;
    MyQueue() {
    }
    
    void push(int x) {
        st1.push(x);
    }
    
    int pop() {
        // push all content from st1 to st2
        if(st2.empty())
        {
            while(!st1.empty())
            {
                st2.push(st1.top());
                st1.pop();
            }
        }
        int tp=st2.top();
        st2.pop();
        return tp;
    }
    
    int peek() {
        // push all content from st1 to st2
        if(st2.empty())
        {
            while(!st1.empty())
            {
                st2.push(st1.top());
                st1.pop();
            }
        }
        return st2.top();
    }
    
    bool empty() {
        // we return true if both are empty
        return st1.empty() && st2.empty();
    }
};