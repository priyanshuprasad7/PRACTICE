public class pzc {
  public static void main(String args[]){

    Student s1 = new Student();
    s1.name= "priyanshu";
    s1.roll= 241010756;
    s1.password = "priyanshu";
    Student s2 = new Student(s1);
    System.out.println("the value is " +s1.name);
    System.out.println("the value is " +s1.roll);
    System.out.println("the value is " +s1.password);
    System.out.println("The value of 2nd const is " + s2.name);
    System.out.println("The value of 2nd const is " + s2.roll);
    s2.password = "ramukaka";
    System.out.println("The value of 2nd const is " + s2.password);
    
  }
}

class Student{
  String name;
  int roll;
  String password;
  Student(){

  }
  Student(Student s1){
    this.name=s1.name;
    this.roll= s1.roll;
    this.password = s1.password;
    
  }
}