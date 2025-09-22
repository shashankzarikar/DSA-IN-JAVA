public class PQ1 {
    public static void printmaze(int maze[][]){
        System.out.println("---------Maze-----------");
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[0].length;j++){
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void ratinmaze(int ansmaze[][],int maze[][],int row,int col){
          if(row==maze.length || col==maze[0].length || row <0 || col <0){
            return;
        }
        if(maze[row][col]==0 || ansmaze[row][col]==1){
           return;
        }
        if(row==maze.length || col==maze[0].length){
            return;
        }
        if(row==maze.length-1&&col==maze[0].length-1){
            ansmaze[row][col]=1;
            printmaze(ansmaze);
            return;
        }


        //up
        ansmaze[row][col]=1;
    
        ratinmaze(ansmaze,maze,row-1,col);
        
        //down
        ratinmaze(ansmaze,maze,row+1,col);
        //left
        
        ratinmaze(ansmaze,maze,row,col-1);
    
        //right
        ratinmaze(ansmaze,maze,row,col+1);
        ansmaze[row][col]=0;
        
    }
    public static void main(String args[]){
        int maze[][] = { { 1, 0, 0, 0 },{ 1, 1, 0, 1 },{ 0, 1, 0, 0 },{ 1, 1, 1, 1 } };
        int ansmaze[][]= new int[maze.length][maze[0].length];
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[0].length;j++){
                ansmaze[i][j]=0;
            }
        }
        ratinmaze(ansmaze,maze,0,0);

    }

}
