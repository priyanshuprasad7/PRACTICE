import java.util.*;
public class pf {
  public static void main (String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number here : ");
    int num = sc.nextInt();
    if (num>0) {
      System.out.println("the number is positive");
    }else if(num==0){
      System.out.println("The number is zero ");
    }else{
      System.out.println("The number is negative");
    }
    
  }
}
