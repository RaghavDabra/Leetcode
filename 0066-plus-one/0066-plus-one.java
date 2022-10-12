class Solution {
    public int[] plusOne(int[] digits) {
        
            int i;
        for (i = digits.length - 1; i >= 0 && digits[i] == 9; i--) {    // cases with 9
            digits[i] = 0;
                 }
    
        if (i == -1) {  // edge case for all digits are 9, so becomes 1 with n zeroes
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;   // new int[] initialise with zeroes, so set first digit as 1
        
    return newDigits;
            }
           digits[i]++;    // found the non 9 digit, just add 1
    return digits;
        }
    }
