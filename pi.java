import java.util.*;
public class pi {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter you year : ");
    int year = sc.nextInt();
    sc.close();
    if(year % 400 == 0){
      System.out.println("This year is a leap year");
    }else if(year % 100 == 0){
      System.out.println("This is not a leap year ");
    }else if(year % 4 == 0){
      System.out.println("This is a leap year ");
    }else{
      System.out.println("this is not a leap year for sure");
    }
    
    
  }
  
}
