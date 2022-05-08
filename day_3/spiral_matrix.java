class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        int n = matrix.length;
        int m = matrix[0].length;
      int tne  = n * m;
      int minr = 0;
      int minc = 0;
      int maxr = n - 1;
      int maxc = m - 1;
      while(cnt < tne){
          for(int j = minc; j <= maxc && cnt < tne; j++){
            int ans = matrix[minr][j];
            list.add(ans);
            cnt++;
         }
          minr++;
          for(int i = minr; i <= maxr && cnt < tne; i++){
            int ans = matrix[i][maxc];
            list.add(ans);
            cnt++;
         }
          maxc--;
          for(int j = maxc; j >=minc && cnt < tne; j--){
            int ans = matrix[maxr][j];
            list.add(ans);
            cnt++;
         }
          maxr--;
          for(int i = maxr; i >= minr && cnt < tne; i--){
            int ans = matrix[i][minc];
            list.add(ans);
            cnt++;
         }
          minc++;
      }
        return list;
    }
}