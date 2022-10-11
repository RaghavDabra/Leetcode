class Solution {
        
        public static void solve(int[] nums,List<List<Integer>>v,int i)
    {
        if(i>=nums.length)
        {
             ArrayList<Integer> cl = new ArrayList<>();
			//creating the list every time when the base conditions get hit
            for(int x:nums)
            {
                cl.add(x);
            }
            v.add(cl);
            return;
        }
        for(int j=i;j<nums.length;j++)
        {
            
            //swap 
    int temp=nums[i];
    nums[i]=nums[j];
    nums[j]=temp;
        
            solve(nums,v,i+1);
            
            
     //swap
     temp=nums[i];
    nums[i]=nums[j];
    nums[j]=temp;
        }
          
    }
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>>v=new ArrayList<>();
         int i=0;
        solve(nums,v,i);
        return v;
        
    }
}