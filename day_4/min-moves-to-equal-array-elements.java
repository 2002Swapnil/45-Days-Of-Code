class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int res =0;
        for(int i=nums.length-1;i>=0;i--){
            res+= nums[i]-nums[0];
        }
        return res;
    }
}