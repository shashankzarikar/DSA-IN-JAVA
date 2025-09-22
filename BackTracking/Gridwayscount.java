public class Gridwayscount {
    public static int gridwayscount(int row,int col,int N , int M){
        if(row==N-1&&col==M-1){
            return 1;
        }
        if(row==N||col==M){
            return 0;
        }
        return gridwayscount(row,col+1,N,M)+gridwayscount(row+1,col,N,M);
    }
    public static void main(String args[]){
        int N=4;
        int M=3;
       
        System.out.println(gridwayscount(0,0,N,M));


    }
    
}
