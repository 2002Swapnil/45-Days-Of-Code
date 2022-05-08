class Solution {
    public int maxScore(int[] arr, int k) {
        int sum = 0;
        for(int i:arr){
            sum+=i;
        }
        int res =0;
        int window=0;
        int n = arr.length;
        if(n==k) return sum;
        for(int i=0;i<n-k-1;i++){
            window+=arr[i];
        }
        for(int i=n-k-1;i<n;i++){
            window+=arr[i];
            res = Math.max(res,sum-window);
            window-=arr[i-(n-k-1)];
        }
        return res;
       
    }
}