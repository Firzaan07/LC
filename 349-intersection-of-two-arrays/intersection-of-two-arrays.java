class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        HashSet<Integer> set=new HashSet<>();
        for(int nums:nums1){
            if(bsearch(nums2,nums)){
                set.add(nums);
            }
        }
        int [] ans=new int[set.size()];
        int i=0;
        for(int x:set){
            ans[i++]=x;
        }
        return ans;
    }

    public boolean bsearch(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return true;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
}