public class pzb {
  public static void main(String args[]){
    Student s1 = new Student("priyanshu");
    // Student s1 = new Student();
    // s1.name= "priyanshu";
    // System.out.println(s1.name);
    
  }
}
class Student{
  String name;
  int roll;

  Student(String alloted_name){
    this.name = alloted_name;
    System.out.println("This constructor is called , and it contain name which is : ");
    System.out.println(this.name);
  }
}