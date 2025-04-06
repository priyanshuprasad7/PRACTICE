public class pzj{
  public static void main(String args[]){
    student s1 = new btech();
    s1.print();
    student s2= new student();
    s2.print();


  }
}
class student{
  void print(){
    System.out.println("Student function is called here : ");
  }
  }
class btech extends student{
  void print(){
    System.out.println("Btech class is called here : ");
  }
}
