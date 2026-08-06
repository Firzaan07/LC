class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer>ans=new ArrayList<>();
        int l=nums.length/3;
        for(int x:map.keySet()){
            if(map.get(x)>l){
                ans.add(x);
            }
        }
        return ans;
    }
}