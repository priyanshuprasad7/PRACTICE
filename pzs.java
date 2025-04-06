public class pzs {
  public static void main(String args[]){
    Chessplayer q = new Queen();
    Chessplayer r = new Rook();
    q.moves();
    r.moves();
  } 
}
class Queen implements Chessplayer{
  public void moves(){
    System.out.println("up,down,left,right");
  }
}
class Rook implements Chessplayer{
  public void moves(){
    System.out.println("straight");
  }
}