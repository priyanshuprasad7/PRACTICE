import java.util.*;
public class calculator {
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the first number here : ");
    float a= sc.nextFloat();
    System.out.println("Enter the second number here ");
    float b = sc.nextFloat();
    System.out.println("Enter the sign");
    char c = sc.next().charAt(0);
    switch (c) {
      case '+':
      System.out.println(a+b);
      break;
      case '-':
      System.out.println(a-b);
      break;
      case '*':
      System.out.println(a*b);
      break;
      case '/':
      System.out.println(a/b);
      break;
      case '%':
      System.out.println(a%b);
      break;
        default:
        System.out.println("enter the valid input here : ");
        break;
    }
  }
  
}
