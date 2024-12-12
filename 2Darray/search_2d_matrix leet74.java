class Solution {
    public static int findrow(int[][] matrix,int r,int c,int target){
        int start=0,end=r-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target>=matrix[mid][0] && target<=matrix[mid][c-1]) return mid;
            else if(target<matrix[mid][0]) {
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }
    public static boolean findcol(int[][] matrix,int row,int c,int target){
        int start=0,end=c-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target==matrix[row][mid]) return true;
            else if(target<matrix[row][mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length,c=matrix[0].length;
        int row=findrow(matrix,r,c,target);
        if(row==-1) return false;
        else{
            return findcol(matrix,row,c,target);
        }
    }
}
//100% beat
