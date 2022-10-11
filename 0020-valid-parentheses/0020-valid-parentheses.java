class Solution {
    public boolean isValid(String s) 
    {
        char curChar;
        Stack<Character> stk = new Stack<>();
        
        char[] arr = s.toCharArray();
        
        for(int i = 0; i < s.length(); i++)
        {
            curChar = arr[i];
            
            if(curChar == '(' || curChar == '[' || curChar == '{' )
            {
                stk.push(curChar);
                continue;
            }
            
            if(stk.empty())
                return false;
            
            if(curChar == ')' && stk.pop() != '(')
                return false;
            
            if(curChar == '}' && stk.pop() != '{')
                return false;
            
            if(curChar == ']' && stk.pop() != '[')
                return false;
        }
        
        if(!stk.empty())
            return false;
        
        return true;
    }
}