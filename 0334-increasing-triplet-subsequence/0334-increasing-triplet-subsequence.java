class Solution {
    public boolean increasingTriplet(int[] nums) {
        int left= Integer.MAX_VALUE, right= Integer.MAX_VALUE;
        //take assumption : left < right
        for(int n: nums){
            //Test each number one by one comparing First with left and then with right
            if(n<=left) left= n;
            else if(n<=right) right= n;  // If n is LTET right, means n is surely GT left
            else return true; // If n is GTET left and GTET right that means we got the increasing triplet
        }
        return false;
    }
}