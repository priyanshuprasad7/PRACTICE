import java.util.*;
public class pg {
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your body temperature in Ferenheit : ");
    double temp = sc.nextDouble();
    if(temp>103.5){
      System.out.println("you got fever");
    }else{
      System.out.println("You not got a fever ");
    }
  }
}
