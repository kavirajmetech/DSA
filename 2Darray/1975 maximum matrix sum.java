class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int countneg=0,r=matrix.length,c=matrix[0].length;
        int m=Integer.MAX_VALUE;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum+=Math.abs(matrix[i][j]);
                countneg+=(matrix[i][j]<0?1:0);
                m=Math.min(m,Math.abs(matrix[i][j]));
            }
        }
        if(countneg%2==0) return sum;
        else return sum-(2*m);
    }
}
