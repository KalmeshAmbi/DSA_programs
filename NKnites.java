public class NKnites {
    public static void main(String[] args) {
        
    }
    static int  knites(boolean [][] board , int row){
        if(row == board.length){
         display(board);
         System.out.println();
         return 1;
        }
        int count = 0;
        for(int col=0 ; col < board.length ; col++){
         if(isSafe(board , row , col)){
            board[row][col] = true;
            count += knites(board, row +1);
            board[row][col] = false;
         }
    }
    return count;
}
     private static boolean isSafe(boolean[][] board, int row, int col) {
        
    }
     static void display(boolean[][] board) {
        for(boolean []row : board){
            for(boolean element : row){
                if(element){
                    System.out.print("K");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println("\n");
        }
    }
    }
