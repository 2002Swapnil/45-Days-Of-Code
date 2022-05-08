
class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();
        for(int i:nums){
            hm.add(i);
        }
        for(int i=0;i<=nums.length;i++){
            if(!hm.contains(i)){
                return i;
            }
        }
        return -1;
    }
}

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return total - sum;
    }
}