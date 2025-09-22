public class Nqueen2 {
      public static void printboard(char board[][]){
        System.out.println("----------Board------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");

            }
            System.out.println();
        }
    }
    public static boolean issafe(char board[][],int row , int col){
        //vertically upward
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left diagonal 
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
             if(board[i][j]=='Q'){
                return false;
            }
        }

        //Right diagonal
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
             if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
        
    } 
    public static boolean nqueens(char board[][],int row){
        if(row==board.length){
            printboard(board);
            return true;
        }
        for(int j=0;j<board.length;j++){
            if(issafe(board,row,j)){
                board[row][j]='Q';
               if( nqueens(board,row+1)){
                return true;

            }
            board[row][j]='X';

        }
    }
    return false;
    

    }
    public static void main(String args[]){
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        if(nqueens(board,0)){
            System.out.println("Solution is possible");
        }
        else{
            System.out.println("Solution is not possible");
        }

    }
    
}
