class Solution {
    public int lengthOfLongestSubstring(String s) {
           HashSet<Character> hset = new HashSet<Character>();
            int start = -1;
            int end = -1;
            int ans = Integer.MIN_VALUE;
            int count = 0;
            for (int i = 0 ; i < s.length() ; i ++) {
            char c = s.charAt(i);
            if (! hset.contains(c)) {
                end = i;
                hset.add(c);
                count++;
                if (start == -1)
                    start = i;
            }
            else 
            {
                if (count > ans)
                    ans = count;
                count--;
                char curr = s.charAt(start);
                hset.remove(curr);
                start++;
                i--;
            }
        }
        
        if (count > ans)
            ans = count;
        
        return ans;
    }
}
