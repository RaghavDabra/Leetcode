class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                stk1.add(s.charAt(i));
            }
            else {
                if (!stk1.isEmpty())
                    stk1.pop();
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != '#') {
                stk2.add(t.charAt(i));
            }
            else {
                if (!stk2.isEmpty())
                    stk2.pop();
            }
        }

        boolean flag = true;

        if (stk1.size() != stk2.size()) {
            return false;
        }

        if (stk1.isEmpty() && stk2.isEmpty()) {
            return true;
        }

        while (!stk1.isEmpty() && !stk2.isEmpty()) {

            if (stk1.pop() == stk2.pop()) {
                flag =  true;
            }
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}