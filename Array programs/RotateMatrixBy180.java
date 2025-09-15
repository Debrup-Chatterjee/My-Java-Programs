class Solution {
    public void reverse(int[] arr,int n){
        int temp;
        for(int i=0;i<n/2;i++){
            temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
    public void rotateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int temp[];
        for(int i=0;i<m/2;i++){
            reverse(mat[i],n);
            reverse(mat[m-i-1],n);
            temp=mat[i];
            mat[i]=mat[m-i-1];
            mat[m-i-1]=temp;
        }
        if(m%2!=0)
            reverse(mat[m/2],n);
    }
}
public class RotateMatrixBy180 {
    public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        Solution ob=new Solution();
        ob.rotateMatrix(mat);
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                System.out.print(mat[i][j]+", ");
            }
            System.out.println();
        }
    }
}
