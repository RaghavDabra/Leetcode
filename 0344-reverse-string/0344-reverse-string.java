class Solution {
    public void reverseString(char[] s) {
        
//         if(s[] = null)
//             return null;
        
//         char prev, curr;
//            curr = s[];
        
//         prev = null;
        
//         if(curr != null)
//         {
//             char[] temp = curr.next;
//             curr.next = prev;
            
//             prev = curr;
//             curr = temp;
            
//         }
//         return prev;
        
        
        
        //2 pointer approach 
        
      int  first = 0,last = s.length-1;
        
        while (first<last)
        {
      char ch = s[first];
            s[first]= s[last];
            s[last]= ch;
            
            first++;
            last--;
        
            }
    }
}