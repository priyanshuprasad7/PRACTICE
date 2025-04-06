import java.util.*;
public class leapyear {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter year here : ");
    int year = sc.nextInt();
     boolean x = (year % 4 == 0);
     boolean y = (year % 100 != 0);
     boolean z = (year % 400 == 0);
     if(x && (y || z)){
      System.out.println("This is a leap year for sure");
     }else{
      System.out.println(
        "this is not an leap year for sure"
      );
     }
  }
}
