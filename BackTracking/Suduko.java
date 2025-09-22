public class Suduko {
     public static void printboard(int board[][]){
        System.out.println("----------Board------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");

            }
            System.out.println();
        }
    }

    
    public static boolean issafe(int sudoku[][],int row,int col,int i){
        
        for(int j=0;j<9;j++){
            //check row 
            if(sudoku[row][j]==i){
                return false;
            }
            // check column
            if(sudoku[j][col]==i){
                return false;
            }
        }
            //Grid 
             int startrow=(row/3)*3;
             int startcol=(col/3)*3;
             for(int m=startrow;m<startrow+3;m++){
                for(int n=startcol;n<startcol+3;n++){
                    if (sudoku[m][n]==i){
                        return false;
                    }
                }
             
             

        }
        return true;
    }
    public static boolean suduko(int sudoku[][],int row,int col){
        if(col==sudoku[0].length){
            row++;
            col=0;
        }
        if(row==9){
            printboard(sudoku);
            return true;

        }
        
        
            if(sudoku[row][col]==0){
                for(int i=1;i<=9;i++){
                    if(issafe(sudoku,row,col,i)){
                        sudoku[row][col]=i;
                        if(suduko(sudoku,row,col+1)){
                            return true;
                        }
                     sudoku[row][col]=0;

                    }
                }
            }
            else{
               return suduko(sudoku,row,col+1);
            }
            return false;
        }
             public static void main(String[] args) {
        int sudoku[][] = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };
       if( suduko(sudoku,0,0)){
        System.out.println("Solution is possible");
       }
       else{
        System.out.println("Solution is not possible");
       }
       

    
}

    }
