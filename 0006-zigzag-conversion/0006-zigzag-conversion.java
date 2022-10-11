class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){ return s; }
        
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++){
            rows[i] = new StringBuilder();
        }
        
        int rowPtr = 0;
        boolean incrementing = true;
        boolean init = true; //makes sure that rowPtr doesn't go negative first iteration
        for(int i = 0; i < s.length(); i++){
            rows[rowPtr].append(s.substring(i,i+1));
            if(rowPtr % (numRows - 1) == 0 && !init){ incrementing = !incrementing; }
            if(incrementing){
                rowPtr++;
            } else{
                rowPtr--;
            }
            init = false;
        }
        
        String ret = "";
        for(StringBuilder sb: rows){
            ret += sb.toString();
        }
        
        return ret;
    }
}