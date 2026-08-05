class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        ArrayList<Integer> set=new ArrayList<>();
        for(int nums:nums1){
            if(bsearch(nums2,nums)){
                set.add(nums);
            }
        }
        int []arr=new int[set.size()];
        int i=0;
        for(int x:set){
            arr[i++]=x;
        }
        return arr;
    }
    public boolean bsearch(int [] a,int target){
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid]==target){
                a[mid]=Integer.MIN_VALUE;
                Arrays.sort(a);
                return true;
            }else if(a[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
}