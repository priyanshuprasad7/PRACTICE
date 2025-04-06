public class py{

  public static void main(String args[]){
    Pen p1 = new Pen();
    p1.SetColor("blue");
    System.out.println(p1.color);
    p1.SetTip(3);
    System.out.println(p1.tip);
    Student s1 = new Student();
    s1.calpercentage(40, 076, 53);
    System.out.println(s1.percentage);
    p1.SetColor("black");
    System.out.println(p1.color);
  }
}

class Pen{
  String color;
  int tip;
  void SetColor(String newcolor){
    color = newcolor;
  }
  void SetTip(int tipsize){
    tip = tipsize;
  }
}
class Student{
  String name;
  int age;
  float percentage;
  void calpercentage(int phy, int chem, int math){
    percentage = (phy+chem+math)/3;
  
  }
}
  

