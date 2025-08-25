import java.util.Arrays;

public class twoD_Array {
    public static void main(String[] args) {
      int [][] matrix={
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12}
      }  ;
      System.out.println(Arrays.toString(binarySearch2D(matrix, 7)));
    }
    static int[] binarySearch2D(int [][]matrix,int target){
        int row=0;
        int col=matrix.length;
        while (row < matrix.length && col >= 0) {
            if(matrix[row][col] == target){
            return new int[]{row,col};
            }else if(matrix[row][col] < target){
                row++;

            }else{
                col--;
            }

            }
            
        
            return new int[]{-1,-1};}
    
}
