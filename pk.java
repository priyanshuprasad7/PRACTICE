import java.util.*;
public class pk {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number here : ");
    int num = sc.nextInt();
    int i = 1;
    while(i<=num){
      System.out.print( i);
      
        if(i<num){
        System.out.print(",");
        }else if(i==num){
          System.out.print(".");
      }
      i++;
    }
  }

}
