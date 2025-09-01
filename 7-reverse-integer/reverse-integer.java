class Solution {
    public int reverse(int x) {
      long s=0;
      while(x!=0)
      {
         int rem=x%10;
         s=s+rem;
         s=s*10;
         x=x/10; 
      }
      s=s/10;
     if(s > Integer.MAX_VALUE || s<Integer.MIN_VALUE){
            return 0;
        }  
      if(x<0){
        return (int)(-1*s);
      }
      return (int)s;
    }
}