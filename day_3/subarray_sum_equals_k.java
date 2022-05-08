class Solution {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum =0;
        int r =0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(hm.containsKey(sum-k)){
                int f = hm.get(sum-k);
                count+=f;
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}