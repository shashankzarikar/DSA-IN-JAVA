public class PQ3 {
    public static void printboard(int board[][]){
        System.out.println("---------------board----------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void knight(int board[][],int row ,int col,int num){
        if(row<0 || col<0 ||row>=board.length || col>=board.length || board[row][col]!=-1){
            return;
        }
        if(num==(board.length*board.length)-1){
            board[row][col]=num;
            printboard(board);
            return;
        }

        
        board[row][col]=num;
    
        
        //backright
        knight(board,row-2,col+1,num+1);
        //frontright
        knight(board,row+2,col+1,num+1);
        //frontleft
        knight(board,row+2,col-1,num+1);
        //leftback
        knight(board,row-1,col-2,num+1);
        //leftfront
        knight(board,row+1,col-2,num+1);
        //rightfront
        knight(board,row+1,col+2,num+1);
         //rightback
        knight(board,row-1,col+2,num+1);
        //backleft
        knight(board,row-2,col-1,num+1);
        board[row][col]=-1;
       



    }
    public static void main(String args[]){
        int n=8;
        int board[][]=new int [n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]=-1;
            }
        }
        knight(board,0,0,0);
        

    }   
}
