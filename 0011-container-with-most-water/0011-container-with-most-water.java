class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int ma=0; //max area
        int ca;   //curr area
        int th;   //tower height,w=width
        while(i<j){
            th=Math.min(height[i],height[j]);
            int w=j-i;
            ca   =th*w;
            if(ma<ca){
                ma=ca;
            }
            if(height[i]<height[j])
            {
                i++;
            }   
            else{
                j--;
            }
        }
        return  ma;
        
    }
}