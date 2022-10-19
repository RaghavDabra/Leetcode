class Solution {
    public String reverseWords(String s) {
        // take array of words
        String[] words = s.split(" ");
        s="";
        for(int i=0;i<words.length;i++) {
            // array of letters of word
            char[] c = words[i].toCharArray();
            // reverse array of letters
            int n=c.length-1, j=0;
            while(j<n) {
                char temp = c[j];
                c[j] = c[n];
                c[n] = temp;
                n--;j++;
            }
            // append to result
            s += new String(c);
            if(i!=words.length-1) s+=" ";
        }
        return s;
    }
}