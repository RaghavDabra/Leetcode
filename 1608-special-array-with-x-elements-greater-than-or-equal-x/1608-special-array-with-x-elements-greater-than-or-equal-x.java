class Solution {
    public int specialArray(int[] nums) {
        int start = 0, end =Integer.MIN_VALUE;
        
        for(int num:nums){
            end = Math.max(num,end);
        }
        
        
        while(start<=end){
            int mid = start + (end-start)/2;
            int count = 0;
            
            for(int num:nums){
                if(num>=mid){
                    count++;
                }
            }
            
            if(count==mid){
                return mid;
            }
            else if(count>mid){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }    
        return -1;
    }
}