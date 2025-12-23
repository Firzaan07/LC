class Solution {
    public int maxSubArray(int[] nums) {
     int ms=nums[0],cs=0;
     int n=nums.length;
     for( int i=0;i<n;i++)
     { 
        cs=cs+nums[i];
    if(cs>ms){
        ms=cs;
    }
        if(cs<0)
        {
            cs=0;
        }
    

     }   
   
    return ms;
     }
}
