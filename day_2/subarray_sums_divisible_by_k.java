class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum =0;
        int r =0;
        int count=0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            r = sum%k;
            if(r<0) r+=k;
            if(hm.containsKey(r)){
                int f = hm.get(r);
                count+=f;
                hm.put(r,f+1);
            }else{
                hm.put(r,1);
            }
            
            
        }
        return count;
    }
}