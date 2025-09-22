public class NQueens {
    public static boolean issafe(char board[][],int row,int col){
        // Straight upward
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //Left diagonal 
        
        for(int m=row-1, n=col-1;m>=0&&n>=0;m--,n--){
              if(board[m][n]=='Q'){
                return false;
            }
        }
        //Right diagonal 
         for(int p=row-1, q=col+1;p>=0&&q<board.length;p--,q++){
              if(board[p][q]=='Q'){
                return false;
            }

        
        

        
        }
        return true;
    }

    
    public static void printboard(char board[][]){
        System.out.println("----------Board------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");

            }
            System.out.println();
        }
    }
    public static void nqueens(char board[][],int row){
        //Base case 
        if(row==board.length){
            printboard(board);
            count ++;
            return;
        }
        for(int j=0;j<board.length;j++){
            if(issafe(board,row,j)){
               board[row][j]='Q';
               nqueens(board,row+1);
               board[row][j]='X';
            }
            
        }
    }
    static int count =0;
    public static void main(String args[]){
        int n=15;
        char board[][]=new char[n][n];
        //initilaization
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        nqueens(board,0);
        System.out.println(count);



    }
    
}
