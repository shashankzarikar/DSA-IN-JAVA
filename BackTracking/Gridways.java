public class Gridways {
       public static void printboard(char board[][]){
        System.out.println("----------Board------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");

            }
            System.out.println();
        }
    }
    public static void gridways(char board[][],int row , int col){
        if(row==board.length-1&&col==board[0].length-1){
            board[row][col]='X';
                printboard(board);
                board[row][col]=' ';
                return;
            }
        if(row>board.length-1||col>board[0].length-1){
            return;
        }
        
            //Right
            board[row][col]='X';
            gridways(board,row,col+1);
            //Down
            gridways(board,row+1,col);
            board[row][col]=' ';
            


        
       
    }
    public static void main(String args[]){
        int N=4;
        int M=3;
        char board[][]=new char[N][M];
       
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                board[i][j]=' ';
            }
        }
        gridways(board,0,0);
       

    }
    
}
