public class pza {
  public static void main(String args[]){
    Pen p1 = new Pen();
    p1.setColor("blue");
    p1.settip(5);
    System.out.println(p1.getcolor());
    System.out.println(p1.gettip() + " mm");
  }
}

class Pen{
  private String color;
  private int tip;
  String getcolor(){
    return this.color;
  }
  void setColor(String newcolor){
    this.color = newcolor;
  }
  int gettip(){
    return this.tip;
  }
  void settip(int tip_size){
    this.tip=tip_size;
  }

}