public class Interfaces {
    public static void main(String args[]) {
        Queen q = new Queen ();
        q.moves();

    }

}

interface chessPlayer {
     void moves(); // by default this method is public and abstract
}

class Queen implements chessPlayer {
     public void moves() {        // we have to public this function because if not it will set as default 
     System.out.println("up,down,left,right,diagonal in all 4 directions");
     }
}

class Rook implements chessPlayer {
     public void moves() {        // we have to public this function because if not it will set as default 
     System.out.println("up,down,left,right");
     }
}

class King implements chessPlayer {
     public void moves() {        // we have to public this function because if not it will set as default 
     System.out.println("up,down,left,right,diagonal in all 4 directions - 1 step");
     }
}
