class Solution {
	public int lengthOfLastWord(String s) {
        String[] string_array = s.split(" ");
        return string_array[string_array.length-1].length();
    }
}