class Solution {
    public int[] twoSum(int[] nums, int target) {
       for(int i=0;i<nums.length;i++){
           for(int j =i+1;j<nums.length;j++){
               int comp = target - nums[i];
               if(nums[j]==comp){
                   return new int[]{i,j};
               }
           }
           
       }
        return new int[0];
    }
}


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []arr = new int[2];
      HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                arr[1]=i;
                arr[0]=hm.get(target-nums[i]);
                return arr;
            }
            hm.put(nums[i], i);
        }
        return arr;
   }
}