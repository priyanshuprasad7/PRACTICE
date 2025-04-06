public class pzr {
  public static void main(String args[]){
    Horse h1= new Horse();
    h1.changeColor();
  }
  
}

abstract class Animal{
  // String color= "Brown";
  Animal(){
    String color = "Brown";
  }
  
  void eat(){
    System.out.println("Animals can eat ");
  }
  abstract void walk();
}

class Horse extends Animal{
  void changeColor(){
    color ="Dark brown";
    System.out.println(color);
  }
  void walk(){
    System.out.println("Horse walk on four legs ");
  }
}