package backTracking;
import java.util.*;




public class nQueens {

    public static boolean isSafe(char board[][] , int row , int col){

        // vertical up
        for(int i = row-1 ; i>=0 ; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
    
        // diag left up
        for(int i = row-1, j= col-1 ; i>=0 && j>=0 ; i-- , j--){
            if(board[i][j] == 'Q'){
                return false;
            }

        }
    
        // diag right up
        for(int i)
    
    }

    public static void nQueens(char board[][] , int row){
        if(row==board.length){
            printBoard(board);
            return ;
        }

        // colun loop
        for(int j = 0; j < board.length; j  ++){
            board[row][j] = 'Q';
            nQueens(board, row+1);
            board[row][j] = '.';

        }
    }
    public static void printBoard(char board[][] ){
        System.out.println("----------------------------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + "");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n =3;
        char board[][] = new char[n][n];
        // initialize
        for(int i = 0; i < n; i++){
            for(int j=0  ; j < n; j++){
                board[i][j] = '.';
            }
        }

        nQueens(board, 0);
    }
    
}
